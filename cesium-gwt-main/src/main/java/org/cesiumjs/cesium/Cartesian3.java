package org.cesiumjs.cesium;

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayNumber;
import com.google.gwt.core.client.JsArrayUtils;

/**
 * @author richkadel
 *
 */
public final class Cartesian3 extends JavaScriptObject {
  
  private static native Cartesian3 getConstant(String name) /*-{
    return Cesium.Cartesian3[name];
  }-*/;
  
  public static final Cartesian3 UNIT_X = getConstant("UNIT_X");
  public static final Cartesian3 UNIT_Y = getConstant("UNIT_Y");
  public static final Cartesian3 UNIT_Z = getConstant("UNIT_Z");
  public static final Cartesian3 ZERO = getConstant("ZERO");

  // Overlay types always have protected, zero argument constructors.
  protected Cartesian3(){}
  

  public static native Cartesian3 create(double x, double y, double z) /*-{
    return Cesium.Cartesian3.fromArray([x, y, z])
  }-*/;
  
  public static native Cartesian3 fromDegrees(double longitude, double latitude) /*-{
    return Cesium.Cartesian3.fromDegrees(longitude, latitude)
  }-*/;
  
  public static native Cartesian3 fromDegrees(
      double longitude, double latitude, double height) /*-{
    return Cesium.Cartesian3.fromDegrees(longitude, latitude, height)
  }-*/;
  
  public static native Cartesian3 fromDegrees(
      double longitude, double latitude, double height, 
      Ellipsoid ellipsoid) /*-{
    return Cesium.Cartesian3.fromDegrees(longitude, latitude, height, ellipsoid)
  }-*/;
  
  public static native Cartesian3 fromDegrees(
      double longitude, double latitude, double height, 
      Ellipsoid ellipsoid, Cartesian3 result) /*-{
    return Cesium.Cartesian3.fromDegrees(longitude, latitude, height, ellipsoid, result)
  }-*/;
  
  public static native Cartesian3 fromRadians(double longitude, double latitude) /*-{
    return Cesium.Cartesian3.fromRadians(longitude, latitude)
  }-*/;
  
  public static native Cartesian3 fromRadians(
      double longitude, double latitude, double height) /*-{
    return Cesium.Cartesian3.fromRadians(longitude, latitude, height)
  }-*/;
  
  public static native Cartesian3 fromRadians(
      double longitude, double latitude, double height, 
      Ellipsoid ellipsoid) /*-{
    return Cesium.Cartesian3.fromRadians(longitude, latitude, height, ellipsoid)
  }-*/;
  
  public static native Cartesian3 fromRadians(
      double longitude, double latitude, double height, 
      Ellipsoid ellipsoid, Cartesian3 result) /*-{
    return Cesium.Cartesian3.fromRadians(longitude, latitude, height, ellipsoid, result)
  }-*/;
  
  public native void setX(double x) /*-{ this.x = x; }-*/;
  public native double getX() /*-{ return this.x; }-*/;
  
  public native void setY(double y) /*-{ this.y = y; }-*/;
  public native double getY() /*-{ return this.y; }-*/;
  
  public native void setZ(double z) /*-{ this.z = z; }-*/;
  public native double getZ() /*-{ return this.z; }-*/;
  
  public native boolean equals(Cartesian3 right) /*-{ return this.equals(right) }-*/;
  
  public static JsArray<Cartesian3> fromDegreesArray(double[] lonLatPairs) {
    return fromDegreesArray(JsArrayUtils.readOnlyJsArray(lonLatPairs));
  }
  
  private static native JsArray<Cartesian3> fromDegreesArray(JsArrayNumber latLonPairs) /*-{
    return Cesium.Cartesian3.fromDegreesArray(latLonPairs);
  }-*/;

  public static JsArray<Cartesian3> fromDegreesArrayHeights(double[] lonLatHeightTriples) {
    return fromDegreesArrayHeights(JsArrayUtils.readOnlyJsArray(lonLatHeightTriples));
  }
  
  private static native JsArray<Cartesian3> fromDegreesArrayHeights(JsArrayNumber coordinates) /*-{
    return Cesium.Cartesian3.fromDegreesArrayHeights(coordinates);
  }-*/;
  
  public native Cartesian3 cloneCartesian3() /*-{
    return this.clone()
  }-*/;

  public static native Cartesian3 cloneCartesian3(Cartesian3 cartesian3) /*-{
    return Cesium.Cartesian3.clone(cartesian3)
  }-*/;

  public static native Cartesian3 clone(Cartesian3 cartesian3, Cartesian3 result) /*-{
    return Cesium.Cartesian3.clone(cartesian3, result)
  }-*/;
  
//  public static double[] fromDegreesArray(double[] lonLatPairs) {
//     return jsArrayToDouble(fromDegreesArray(JsArrayUtils.readOnlyJsArray(lonLatPairs)));
//  }
//  
//  private static native JsArrayNumber fromDegreesArray(JsArrayNumber coordinates) /*-{
//    return Cesium.Cartesian3.fromDegreesArray(coordinates);
//  }-*/;
//
//  public static double[] fromDegreesArray(double[] lonLatPairs, Ellipsoid ellipsoid, double[] result) {
//     return jsArrayToDouble(fromDegreesArray(JsArrayUtils.readOnlyJsArray(lonLatPairs), ellipsoid, result));
//  }
//  
//  private static native JsArrayNumber fromDegreesArray(JsArrayNumber coordinates, Ellipsoid ellipsoid, double[] result) /*-{
//    return Cesium.Cartesian3.fromDegreesArray(coordinates, ellipsoid, result);
//  }-*/;
//
//  public static double[] fromDegreesArrayHeights(double[] lonLatHeightTriples) {
//     return jsArrayToDouble(fromDegreesArrayHeights(JsArrayUtils.readOnlyJsArray(lonLatHeightTriples)));
//  }
//  
//  private static native JsArrayNumber fromDegreesArrayHeights(JsArrayNumber coordinates) /*-{
//    return Cesium.Cartesian3.fromDegreesArrayHeights(coordinates);
//  }-*/;
//
//  public static double[] fromDegreesArrayHeights(double[] lonLatHeightTriples, Ellipsoid ellipsoid, double[] result) {
//     return jsArrayToDouble(fromDegreesArrayHeights(JsArrayUtils.readOnlyJsArray(lonLatHeightTriples), ellipsoid, result));
//  }
//  
//  private static native JsArrayNumber fromDegreesArrayHeights(JsArrayNumber coordinates, Ellipsoid ellipsoid, double[] result) /*-{
//    return Cesium.Cartesian3.fromDegreesArrayHeights(coordinates, ellipsoid, result);
//  }-*/;
//  
//  private static native double[] jsArrayToDouble(JsArrayNumber jsArrayNumber) /*-{ return jsArrayNumber }-*/;
}