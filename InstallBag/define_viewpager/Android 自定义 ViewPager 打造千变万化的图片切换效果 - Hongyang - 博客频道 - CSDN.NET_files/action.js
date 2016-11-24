(function () {
  // 2015.12.09

  var RRFL20151209 = {
    _init: function () {
      if (!this._curDomain) return;
      this._insertStyle();
      this._insertDom();
    },
    _url: function (argument) {
      return encodeURIComponent(window.location.href);
    },
    _isBigInc: function () {
      return document.body.offsetWidth >= 1180;
    },
    _curDomain: function () {
      var href = this._url();
      if (/item\.taobao\.com/g.test(href)) {
        return 'taobao';
      };
      if (/detail\.tmall\.com/g.test(href)) {
        return 'tmall';
      };
      return '';
    },
    _auchor: function () {
      var cur = this._curDomain(),
          tag = 'rr-' + cur + (this._isBigInc() ? '-big' : '-normal');
      var a = document.createElement('a');
      a.href = 'http://www.365bihu.com/index.php?mod=tao&act=view&q=' + this._url();
      a.target = '_blank';
      a.innerHTML = '&#x53BB;&#x8FD4;&#x5229;&#x8D2D;&#x4E70;';
      // a.title = '&#x53BB;&#x8FD4;&#x5229;&#x8D2D;&#x4E70;';
      a.setAttribute('class', tag);
      return a;
    },
    _insertDom: function () {
      var domain = this._curDomain(),
          obj = this._auchor(),
          bool = this._isBigInc(),
          p;
      switch (domain) {
        case 'taobao':
          if (bool) {
            p = document.getElementById('J_juValid');
          } else {
            var temp = document.getElementById('J_StrPrice');
            p = temp.parentNode || temp.parentElement;
          }
        break;
        case 'tmall':
          p = document.getElementById('J_Amount');
        break;
        default:;
      }
      p && p.appendChild(obj);
    },
    _insertStyle: function () {

      var style = document.createElement('style'),
          head = document.getElementsByTagName('head');
      var css = '\
          #detail a.rr-taobao-big{ float: left; line-height: 40px; padding: 0 15px; font-size: 14px; color: #fff; background: #f40; border-radius: 2px; margin-left: 10px;}\
          #detail a.rr-taobao-big:hover{ background: #f20;}\
          #detail a.rr-taobao-normal{ display: inline-block; background: #ff8e1b; color: #fff; padding: 0 5px; border-radius: 2px; line-height: 25px; margin-left: 5px;}\
          #detail a.rr-taobao-normal:hover{ background: #f60;}\
          #page a.rr-tmall-big, #page a.rr-tmall-normal{ display: inline-block; line-height: 30px; background: #c40000; padding: 0 10px; color: #fff; border-radius: 2px; margin-left: 12px;}\
          #page a.rr-tmall-big:hover, #page a.rr-tmall-normal:hover{ text-decoration: none; background: #b50000;}\
          #page .tb-attention a.rr-tmall-big, #page .tb-attention a.rr-tmall-normal{ position: absolute; right: 50px;}\
          #itemInfo #choose-btn-append a.rr-jd-big, #itemInfo #choose-btn-append a.rr-jd-normal{ line-height: 36px; background-color: rgb(222, 53, 60); color: #f0f0f0; padding: 0 10px; border-radius: 2px; text-shadow: 1px 1px 1px #999;}\
          #itemInfo #choose-btn-append a.rr-jd-big:hover, #itemInfo #choose-btn-append a.rr-jd-normal:hover{ background-color: rgb(237, 82, 87); color: #f0f0f0; padding: 0 10px; border-radius: 2px; text-shadow: 1px 1px 1px #999;}';

      style.setAttribute('type', 'text/css');

      if (style.styleSheet) {
        style.styleSheet.cssText = css;
      } else {
        var cssText = document.createTextNode(css);
        style.appendChild(cssText);
      }
      if (head.length) {
        head[0].appendChild(style);
      } else {
        doc.documentElement.appendChild(style);
      }

    }
  }

  RRFL20151209._init();

})()