function cesiumsamples(){var cb='',_=' top: -1000px;',zb='" for "gwt:onLoadErrorFn"',xb='" for "gwt:onPropertyErrorFn"',ib='");',Ab='#',_b='.cache.js',Cb='/',Ib='//',Vb='2D365B9BBC4E0DC33B35CE5D943DF1B6',Wb='94FFD473CFAFD952EC655CDC235D2983',Xb='974043378D9ACB2D2B00DEA624723A7B',Yb='9D28ABCF77D515ED9833BD1E35C34881',$b=':',rb='::',mc=':moduleBase',bb='<!doctype html>',db='<html><head><\/head><body><\/body><\/html>',ub='=',Bb='?',wb='Bad handler "',ab='CSS1Compat',gb='Chrome',Zb='D48F4890AD1158EE84C5B02A4D37A98A',fb='DOMContentLoaded',W='DUMMY',lc='Ignoring non-whitelisted Dev Mode URL: ',kc='__gwtDevModeHook:cesiumsamples',jc='_gwt_dummy_',Hb='base',Fb='baseUrl',R='begin',X='body',Q='bootstrap',U='cesiumsamples',Ub='cesiumsamples.devmode.js',Gb='cesiumsamples.nocache.js',qb='cesiumsamples::',Eb='clear.cache.gif',tb='content',gc='end',hb='eval("',ic='file:',Qb='gecko',Rb='gecko1_8',S='gwt.codesvr.cesiumsamples=',T='gwt.codesvr=',fc='gwt/standard/standard.css',yb='gwt:onLoadErrorFn',vb='gwt:onPropertyErrorFn',sb='gwt:property',nb='head',dc='href',hc='http:',Nb='ie10',Pb='ie8',Ob='ie9',Y='iframe',Db='img',kb='javascript',Z='javascript:""',ac='link',ec='loadExternalRefs',ob='meta',mb='moduleRequested',lb='moduleStartup',Mb='msie',pb='name',$='position:absolute; width:0; height:0; border:none; left: -1000px;',bc='rel',Lb='safari',jb='script',Tb='selectingPermutation',V='startup',cc='stylesheet',eb='undefined',Sb='unknown',Jb='user.agent',Kb='webkit';var o=window;var p=document;r(Q,R);function q(){var a=o.location.search;return a.indexOf(S)!=-1||a.indexOf(T)!=-1}
function r(a,b){if(o.__gwtStatsEvent){o.__gwtStatsEvent({moduleName:U,sessionId:o.__gwtStatsSessionId,subSystem:V,evtGroup:a,millis:(new Date).getTime(),type:b})}}
cesiumsamples.__sendStats=r;cesiumsamples.__moduleName=U;cesiumsamples.__errFn=null;cesiumsamples.__moduleBase=W;cesiumsamples.__softPermutationId=0;cesiumsamples.__computePropValue=null;cesiumsamples.__getPropMap=null;cesiumsamples.__gwtInstallCode=function(){};cesiumsamples.__gwtStartLoadingFragment=function(){return null};var s=function(){return false};var t=function(){return null};__propertyErrorFunction=null;var u=o.__gwt_activeModules=o.__gwt_activeModules||{};u[U]={moduleName:U};var v;function w(){B();return v}
function A(){B();return v.getElementsByTagName(X)[0]}
function B(){if(v){return}var a=p.createElement(Y);a.src=Z;a.id=U;a.style.cssText=$+_;a.tabIndex=-1;p.body.appendChild(a);v=a.contentDocument;if(!v){v=a.contentWindow.document}v.open();var b=document.compatMode==ab?bb:cb;v.write(b+db);v.close()}
function C(k){function l(a){function b(){if(typeof p.readyState==eb){return typeof p.body!=eb&&p.body!=null}return /loaded|complete/.test(p.readyState)}
var c=b();if(c){a();return}function d(){if(!c){c=true;a();if(p.removeEventListener){p.removeEventListener(fb,d,false)}if(e){clearInterval(e)}}}
if(p.addEventListener){p.addEventListener(fb,d,false)}var e=setInterval(function(){if(b()){d()}},50)}
function m(c){function d(a,b){a.removeChild(b)}
var e=A();var f=w();var g;if(navigator.userAgent.indexOf(gb)>-1&&window.JSON){var h=f.createDocumentFragment();h.appendChild(f.createTextNode(hb));for(var i=0;i<c.length;i++){var j=window.JSON.stringify(c[i]);h.appendChild(f.createTextNode(j.substring(1,j.length-1)))}h.appendChild(f.createTextNode(ib));g=f.createElement(jb);g.language=kb;g.appendChild(h);e.appendChild(g);d(e,g)}else{for(var i=0;i<c.length;i++){g=f.createElement(jb);g.language=kb;g.text=c[i];e.appendChild(g);d(e,g)}}}
cesiumsamples.onScriptDownloaded=function(a){l(function(){m(a)})};r(lb,mb);var n=p.createElement(jb);n.src=k;p.getElementsByTagName(nb)[0].appendChild(n)}
cesiumsamples.__startLoadingFragment=function(a){return G(a)};cesiumsamples.__installRunAsyncCode=function(a){var b=A();var c=w().createElement(jb);c.language=kb;c.text=a;b.appendChild(c);b.removeChild(c)};function D(){var c={};var d;var e;var f=p.getElementsByTagName(ob);for(var g=0,h=f.length;g<h;++g){var i=f[g],j=i.getAttribute(pb),k;if(j){j=j.replace(qb,cb);if(j.indexOf(rb)>=0){continue}if(j==sb){k=i.getAttribute(tb);if(k){var l,m=k.indexOf(ub);if(m>=0){j=k.substring(0,m);l=k.substring(m+1)}else{j=k;l=cb}c[j]=l}}else if(j==vb){k=i.getAttribute(tb);if(k){try{d=eval(k)}catch(a){alert(wb+k+xb)}}}else if(j==yb){k=i.getAttribute(tb);if(k){try{e=eval(k)}catch(a){alert(wb+k+zb)}}}}}t=function(a){var b=c[a];return b==null?null:b};__propertyErrorFunction=d;cesiumsamples.__errFn=e}
function F(){function e(a){var b=a.lastIndexOf(Ab);if(b==-1){b=a.length}var c=a.indexOf(Bb);if(c==-1){c=a.length}var d=a.lastIndexOf(Cb,Math.min(c,b));return d>=0?a.substring(0,d+1):cb}
function f(a){if(a.match(/^\w+:\/\//)){}else{var b=p.createElement(Db);b.src=a+Eb;a=e(b.src)}return a}
function g(){var a=t(Fb);if(a!=null){return a}return cb}
function h(){var a=p.getElementsByTagName(jb);for(var b=0;b<a.length;++b){if(a[b].src.indexOf(Gb)!=-1){return e(a[b].src)}}return cb}
function i(){var a=p.getElementsByTagName(Hb);if(a.length>0){return a[a.length-1].href}return cb}
function j(){var a=p.location;return a.href==a.protocol+Ib+a.host+a.pathname+a.search+a.hash}
var k=g();if(k==cb){k=h()}if(k==cb){k=i()}if(k==cb&&j()){k=e(p.location.href)}k=f(k);return k}
function G(a){if(a.match(/^\//)){return a}if(a.match(/^[a-zA-Z]+:\/\//)){return a}return cesiumsamples.__moduleBase+a}
function H(){var f=[];var g=0;function h(a,b){var c=f;for(var d=0,e=a.length-1;d<e;++d){c=c[a[d]]||(c[a[d]]=[])}c[a[e]]=b}
var i=[];var j=[];function k(a){var b=j[a](),c=i[a];if(b in c){return b}var d=[];for(var e in c){d[c[e]]=e}if(__propertyErrorFunc){__propertyErrorFunc(a,d,b)}throw null}
j[Jb]=function(){var b=navigator.userAgent.toLowerCase();var c=function(a){return parseInt(a[1])*1000+parseInt(a[2])};if(function(){return b.indexOf(Kb)!=-1}())return Lb;if(function(){return b.indexOf(Mb)!=-1&&p.documentMode>=10}())return Nb;if(function(){return b.indexOf(Mb)!=-1&&p.documentMode>=9}())return Ob;if(function(){return b.indexOf(Mb)!=-1&&p.documentMode>=8}())return Pb;if(function(){return b.indexOf(Qb)!=-1}())return Rb;return Sb};i[Jb]={gecko1_8:0,ie10:1,ie8:2,ie9:3,safari:4};s=function(a,b){return b in i[a]};cesiumsamples.__getPropMap=function(){var a={};for(var b in i){if(i.hasOwnProperty(b)){a[b]=k(b)}}return a};cesiumsamples.__computePropValue=k;o.__gwt_activeModules[U].bindings=cesiumsamples.__getPropMap;r(Q,Tb);if(q()){return G(Ub)}var l;try{h([Nb],Vb);h([Pb],Wb);h([Ob],Xb);h([Rb],Yb);h([Lb],Zb);l=f[k(Jb)];var m=l.indexOf($b);if(m!=-1){g=parseInt(l.substring(m+1),10);l=l.substring(0,m)}}catch(a){}cesiumsamples.__softPermutationId=g;return G(l+_b)}
function I(){if(!o.__gwt_stylesLoaded){o.__gwt_stylesLoaded={}}function c(a){if(!__gwt_stylesLoaded[a]){var b=p.createElement(ac);b.setAttribute(bc,cc);b.setAttribute(dc,G(a));p.getElementsByTagName(nb)[0].appendChild(b);__gwt_stylesLoaded[a]=true}}
r(ec,R);c(fc);r(ec,gc)}
D();cesiumsamples.__moduleBase=F();u[U].moduleBase=cesiumsamples.__moduleBase;var J=H();if(o){var K=!!(o.location.protocol==hc||o.location.protocol==ic);o.__gwt_activeModules[U].canRedirect=K;function L(){var b=jc;try{o.sessionStorage.setItem(b,b);o.sessionStorage.removeItem(b);return true}catch(a){return false}}
if(K&&L()){var M=kc;var N=o.sessionStorage[M];if(!/^http:\/\/(localhost|127\.0\.0\.1)(:\d+)?\/.*$/.test(N)){if(N&&(window.console&&console.log)){console.log(lc+N)}N=cb}if(N&&!o[M]){o[M]=true;o[M+mc]=F();var O=p.createElement(jb);O.src=N;var P=p.getElementsByTagName(nb)[0];P.insertBefore(O,P.firstElementChild||P.children[0]);return false}}}I();r(Q,gc);C(J);return true}
cesiumsamples.succeeded=cesiumsamples();