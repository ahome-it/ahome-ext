function kitchensink(){var fb='',cb=' top: -1000px;',Cb='" for "gwt:onLoadErrorFn"',Ab='" for "gwt:onPropertyErrorFn"',lb='");',Db='#',Nb='&',hc='.cache.js',Fb='/',Lb='//',gc=':',ub='::',tc=':moduleBase',eb='<!doctype html>',gb='<html><head><\/head><body><\/body><\/html>',xb='=',Eb='?',zb='Bad handler "',db='CSS1Compat',jb='Chrome',ib='DOMContentLoaded',Z='DUMMY',fc="GWT module 'kitchensink' may need to be (re)compiled",sc='Ignoring non-whitelisted Dev Mode URL: ',rc='__gwtDevModeHook:kitchensink',Ub='android',Kb='base',Ib='baseUrl',U='begin',$='body',T='bootstrap',Hb='clear.cache.gif',wb='content',Ob='desktop',oc='end',kb='eval("',qc='file:',Mb='formfactor',ac='gecko',bc='gecko1_8',V='gwt.codesvr.kitchensink=',W='gwt.codesvr=',nc='gwt/clean/clean.css',Bb='gwt:onLoadErrorFn',yb='gwt:onPropertyErrorFn',vb='gwt:property',qb='head',lc='href',pc='http:',Zb='ie10',_b='ie8',$b='ie9',_='iframe',Gb='img',Tb='ipad',Rb='iphone',Sb='ipod',nb='javascript',ab='javascript:""',X='kitchensink',ec='kitchensink.devmode.js',Jb='kitchensink.nocache.js',tb='kitchensink::',ic='link',mc='loadExternalRefs',rb='meta',pb='moduleRequested',ob='moduleStartup',Yb='msie',sb='name',Pb='phone',bb='position:absolute; width:0; height:0; border:none; left: -1000px;',jc='rel',Xb='safari',mb='script',dc='selectingPermutation',Y='startup',kc='stylesheet',Qb='tablet',hb='undefined',cc='unknown',Vb='user.agent',Wb='webkit';var s=window;var t=document;v(T,U);function u(){var a=s.location.search;return a.indexOf(V)!=-1||a.indexOf(W)!=-1}
function v(a,b){if(s.__gwtStatsEvent){s.__gwtStatsEvent({moduleName:X,sessionId:s.__gwtStatsSessionId,subSystem:Y,evtGroup:a,millis:(new Date).getTime(),type:b})}}
kitchensink.__sendStats=v;kitchensink.__moduleName=X;kitchensink.__errFn=null;kitchensink.__moduleBase=Z;kitchensink.__softPermutationId=0;kitchensink.__computePropValue=null;kitchensink.__getPropMap=null;kitchensink.__gwtInstallCode=function(){};kitchensink.__gwtStartLoadingFragment=function(){return null};var w=function(){return false};var A=function(){return null};__propertyErrorFunction=null;var B=s.__gwt_activeModules=s.__gwt_activeModules||{};B[X]={moduleName:X};var C;function D(){G();return C}
function F(){G();return C.getElementsByTagName($)[0]}
function G(){if(C){return}var a=t.createElement(_);a.src=ab;a.id=X;a.style.cssText=bb+cb;a.tabIndex=-1;t.body.appendChild(a);C=a.contentDocument;if(!C){C=a.contentWindow.document}C.open();var b=document.compatMode==db?eb:fb;C.write(b+gb);C.close()}
function H(k){function l(a){function b(){if(typeof t.readyState==hb){return typeof t.body!=hb&&t.body!=null}return /loaded|complete/.test(t.readyState)}
var c=b();if(c){a();return}function d(){if(!c){c=true;a();if(t.removeEventListener){t.removeEventListener(ib,d,false)}if(e){clearInterval(e)}}}
if(t.addEventListener){t.addEventListener(ib,d,false)}var e=setInterval(function(){if(b()){d()}},50)}
function m(c){function d(a,b){a.removeChild(b)}
var e=F();var f=D();var g;if(navigator.userAgent.indexOf(jb)>-1&&window.JSON){var h=f.createDocumentFragment();h.appendChild(f.createTextNode(kb));for(var i=0;i<c.length;i++){var j=window.JSON.stringify(c[i]);h.appendChild(f.createTextNode(j.substring(1,j.length-1)))}h.appendChild(f.createTextNode(lb));g=f.createElement(mb);g.language=nb;g.appendChild(h);e.appendChild(g);d(e,g)}else{for(var i=0;i<c.length;i++){g=f.createElement(mb);g.language=nb;g.text=c[i];e.appendChild(g);d(e,g)}}}
kitchensink.onScriptDownloaded=function(a){l(function(){m(a)})};v(ob,pb);var n=t.createElement(mb);n.src=k;t.getElementsByTagName(qb)[0].appendChild(n)}
kitchensink.__startLoadingFragment=function(a){return K(a)};kitchensink.__installRunAsyncCode=function(a){var b=F();var c=D().createElement(mb);c.language=nb;c.text=a;b.appendChild(c);b.removeChild(c)};function I(){var c={};var d;var e;var f=t.getElementsByTagName(rb);for(var g=0,h=f.length;g<h;++g){var i=f[g],j=i.getAttribute(sb),k;if(j){j=j.replace(tb,fb);if(j.indexOf(ub)>=0){continue}if(j==vb){k=i.getAttribute(wb);if(k){var l,m=k.indexOf(xb);if(m>=0){j=k.substring(0,m);l=k.substring(m+1)}else{j=k;l=fb}c[j]=l}}else if(j==yb){k=i.getAttribute(wb);if(k){try{d=eval(k)}catch(a){alert(zb+k+Ab)}}}else if(j==Bb){k=i.getAttribute(wb);if(k){try{e=eval(k)}catch(a){alert(zb+k+Cb)}}}}}A=function(a){var b=c[a];return b==null?null:b};__propertyErrorFunction=d;kitchensink.__errFn=e}
function J(){function e(a){var b=a.lastIndexOf(Db);if(b==-1){b=a.length}var c=a.indexOf(Eb);if(c==-1){c=a.length}var d=a.lastIndexOf(Fb,Math.min(c,b));return d>=0?a.substring(0,d+1):fb}
function f(a){if(a.match(/^\w+:\/\//)){}else{var b=t.createElement(Gb);b.src=a+Hb;a=e(b.src)}return a}
function g(){var a=A(Ib);if(a!=null){return a}return fb}
function h(){var a=t.getElementsByTagName(mb);for(var b=0;b<a.length;++b){if(a[b].src.indexOf(Jb)!=-1){return e(a[b].src)}}return fb}
function i(){var a=t.getElementsByTagName(Kb);if(a.length>0){return a[a.length-1].href}return fb}
function j(){var a=t.location;return a.href==a.protocol+Lb+a.host+a.pathname+a.search+a.hash}
var k=g();if(k==fb){k=h()}if(k==fb){k=i()}if(k==fb&&j()){k=e(t.location.href)}k=f(k);return k}
function K(a){if(a.match(/^\//)){return a}if(a.match(/^[a-zA-Z]+:\/\//)){return a}return kitchensink.__moduleBase+a}
function L(){var l=[];var m;var n=[];var o=[];function p(a){var b=o[a](),c=n[a];if(b in c){return b}var d=[];for(var e in c){d[c[e]]=e}if(__propertyErrorFunc){__propertyErrorFunc(a,d,b)}throw null}
o[Mb]=function(){var a=location.search;var b=a.indexOf(Mb);if(b>=0){var c=a.substring(b);var d=c.indexOf(xb)+1;var e=c.indexOf(Nb);if(e==-1){e=c.length}var f=c.substring(d,e);if(f!=Ob&&(f!=Pb&&f!=Qb)){f=Ob}return f}var g=navigator.userAgent.toLowerCase();if(g.indexOf(Rb)!=-1||g.indexOf(Sb)!=-1){return Pb}else if(g.indexOf(Tb)!=-1){return Qb}else if(g.indexOf(Ub)!=-1||g.indexOf(Pb)!=-1){var h=160;var i=s.screen.width/h;var j=s.screen.height/h;var k=Math.sqrt(i*i+j*j);return k<6?Pb:Qb}return Ob};n[Mb]={desktop:0,phone:1,tablet:2};o[Vb]=function(){var b=navigator.userAgent.toLowerCase();var c=function(a){return parseInt(a[1])*1000+parseInt(a[2])};if(function(){return b.indexOf(Wb)!=-1}())return Xb;if(function(){return b.indexOf(Yb)!=-1&&t.documentMode>=10}())return Zb;if(function(){return b.indexOf(Yb)!=-1&&t.documentMode>=9}())return $b;if(function(){return b.indexOf(Yb)!=-1&&t.documentMode>=8}())return _b;if(function(){return b.indexOf(ac)!=-1}())return bc;return cc};n[Vb]={gecko1_8:0,ie10:1,ie8:2,ie9:3,safari:4};w=function(a,b){return b in n[a]};kitchensink.__getPropMap=function(){var a={};for(var b in n){if(n.hasOwnProperty(b)){a[b]=p(b)}}return a};kitchensink.__computePropValue=p;s.__gwt_activeModules[X].bindings=kitchensink.__getPropMap;v(T,dc);if(u()){return K(ec)}var q;try{alert(fc);return;var r=q.indexOf(gc);if(r!=-1){m=parseInt(q.substring(r+1),10);q=q.substring(0,r)}}catch(a){}kitchensink.__softPermutationId=m;return K(q+hc)}
function M(){if(!s.__gwt_stylesLoaded){s.__gwt_stylesLoaded={}}function c(a){if(!__gwt_stylesLoaded[a]){var b=t.createElement(ic);b.setAttribute(jc,kc);b.setAttribute(lc,K(a));t.getElementsByTagName(qb)[0].appendChild(b);__gwt_stylesLoaded[a]=true}}
v(mc,U);c(nc);v(mc,oc)}
I();kitchensink.__moduleBase=J();B[X].moduleBase=kitchensink.__moduleBase;var N=L();if(s){var O=!!(s.location.protocol==pc||s.location.protocol==qc);s.__gwt_activeModules[X].canRedirect=O;if(O){var P=rc;var Q=s.sessionStorage[P];if(!/^http:\/\/(localhost|127\.0\.0\.1)(:\d+)?\/.*$/.test(Q)){if(Q&&(window.console&&console.log)){console.log(sc+Q)}Q=fb}if(Q&&!s[P]){s[P]=true;s[P+tc]=J();var R=t.createElement(mb);R.src=Q;var S=t.getElementsByTagName(qb)[0];S.insertBefore(R,S.firstElementChild||S.children[0]);return false}}}M();v(T,oc);H(N);return true}
kitchensink.succeeded=kitchensink();