**Note that this library is now maintained in the _Harmonia Holdings Group_ [GitHub site for Cesium-GWT](https://github.com/Harmonia-Holdings-Group/cesium-gwt)**

cesium-gwt
==========

GWT wrappers around some of the Cesium JS library.

The latest version has been upgraded to Cesium 1.2 and was also tested
against Cesium 1.0. This release should still be forward-compatible with
future Cesium JavaScript releases, but some new features 
may not be backward compatible. (For example, GeoJSON
support was added to Cesium after 1.0's release. Cesium-GWT now supports
GeoJSON, but only if you are using a version of Cesium that supports it.)

Note: This release now depends on the JsFunction-GWT API (also on GitHub). 
JsFunction APIs were part of Cesium-GWT but have been broken out into 
a separate library for multipurpose use (including use in the OWF-GWT API 
for OZONE Widget Framework.

The project page, including "To Do's", can be found at 
http://richkadel.github.io/cesium-gwt.

You may also be interested in checking out:

* [JsFunction-GWT](https://github.com/richkadel/jsfunction-gwt) (used in Cesium-GWT)
* [OWF-GWT](https://github.com/richkadel/owf-gwt)

License
-------

Apache 2.0

(This library is based on the Apache 2.0-licensed Cesium project at
https://github.com/AnalyticalGraphicsInc/cesium .)
