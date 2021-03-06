package com.harmonia.cesiumsamples;

import org.cesiumjs.cesium.Cartesian3;
import org.cesiumjs.cesium.Cartographic;
import org.cesiumjs.cesium.Cesium;
import org.cesiumjs.cesium.CesiumConfiguration;
import org.cesiumjs.cesium.CesiumWidget;
import org.cesiumjs.cesium.CesiumWidget.Options;
import org.cesiumjs.cesium.CesiumWidgetPanel;
import org.cesiumjs.cesium.Ellipsoid;
import org.cesiumjs.cesium.ImageryProvider;
import org.cesiumjs.cesium.Label;
import org.cesiumjs.cesium.LabelCollection;
import org.cesiumjs.cesium.Scene;
import org.cesiumjs.cesium.TerrainProvider;
import org.cesiumjs.cesium.events.MouseMoveEvent;
import org.cesiumjs.cesium.events.MouseMoveEventListener;
import org.cesiumjs.cesium.events.MovementEvent;
import org.cesiumjs.cesium.events.ScreenSpaceEventHandler;
import org.cesiumjs.cesium.events.ScreenSpaceEventType;
import org.cesiumjs.cesium.providers.BingMapsImageryProvider;
import org.cesiumjs.cesium.providers.BingMapsStyle;
import org.cesiumjs.cesium.providers.CesiumTerrainProvider;

import com.google.gwt.animation.client.AnimationScheduler;
import com.google.gwt.animation.client.AnimationScheduler.AnimationCallback;
import com.google.gwt.animation.client.AnimationScheduler.AnimationHandle;
import com.google.gwt.dom.client.Element;
import com.google.gwt.i18n.client.NumberFormat;

public class CesiumWidgetPlayer extends CesiumWidgetPanel {
  
  private static final NumberFormat numberFormat = NumberFormat.getFormat("0.00");

  private CesiumWidget cesiumWidget;
  private AnimationHandle loop;
  private LabelCollection labels;

  public CesiumWidgetPlayer(CesiumConfiguration configuration) {
    super(configuration);
  }

  /**
   * @return the cesiumWidget
   */
  public CesiumWidget getCesiumWidget() {
    return cesiumWidget;
  }

  @Override
  public CesiumWidget createCesiumWidget(Element element) {

    BingMapsImageryProvider.Options bingMapOptions = 
      BingMapsImageryProvider.Options.create()
        .mapStyle(BingMapsStyle.AERIAL_WITH_LABELS);

    if (getConfiguration().getBingMapsKey() != null) {
      bingMapOptions.key(getConfiguration().getBingMapsKey());
    }

    ImageryProvider bingMaps = BingMapsImageryProvider
        .create(bingMapOptions);
    
    TerrainProvider terrainProvider = CesiumTerrainProvider.create(CesiumTerrainProvider.CESIUM_SMALL_TERRAIN_URL);

    cesiumWidget = CesiumWidget.create(element,
        Options.create().imageryProvider(bingMaps)
            .terrainProvider(terrainProvider)
            .useDefaultRenderLoop(false));
    
    pickCartographicPosition(cesiumWidget);

    return cesiumWidget;
  }

  public void play() {
    if (loop != null) {
      return;
    }

    final AnimationScheduler scheduler = AnimationScheduler.get();

    loop = scheduler.requestAnimationFrame(new AnimationCallback() {

      public void execute(double timestamp) {
        if (cesiumWidget != null) {
          cesiumWidget.resize();
          cesiumWidget.render();
        }
        loop = scheduler.requestAnimationFrame(this);
      }

    });
  }

  public void pause() {
    if (loop != null) {
      loop.cancel();
      loop = null;
    }
  }

  private void pickCartographicPosition(CesiumWidget cesiumWidget) {
    
    final Scene scene = cesiumWidget.getScene();
    final Ellipsoid ellipsoid = scene.getGlobe().getEllipsoid();
      
    double scaleFactor = 1.0;
      
    int fontPixels = 18;
  
    if (labels == null) { // label collection for the position label
      labels = LabelCollection.create();
    }
    
    final Label label = labels.add(Label.create()
      .setFont((fontPixels*scaleFactor)+"px sans-serif")
    );
    
    scene.getPrimitives().add(labels);
  
    // Mouse over the globe to see the cartographic position
    ScreenSpaceEventHandler handler = ScreenSpaceEventHandler.create(scene.getCanvas());
      
    handler.setInputAction(
      new MouseMoveEventListener() {
        public void callback(MouseMoveEvent movement) {
          Cartesian3 cartesian = scene.getCamera().pickEllipsoid(movement.getEndPosition(), ellipsoid);
          if (cartesian != null) {
              Cartographic cartographic = ellipsoid.cartesianToCartographic(cartesian);
              label.setShow(true);
              label.setText(
                  "(" 
                + numberFormat.format(Cesium.Math.toDegrees(cartographic.getLatitudeRadians()))
                + ", " 
                + numberFormat.format(Cesium.Math.toDegrees(cartographic.getLongitudeRadians()))
                + ")"
              );
              label.setPosition(cartesian);
          } else {
              label.setText("");
          }
        }
      },
      ScreenSpaceEventType.MOUSE_MOVE
    );
  }
}
