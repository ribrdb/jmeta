package jmeta;
// generated by jmeta on Mon Aug 09 10:09:50 PDT 2010
// do not modify, instead edit original .jmeta file
import jmeta.*;


import java.util.*;

final class  DoError {
    String msg = null;
    public DoError(Object m) { msg = (String)m; }
    public String message() { return msg; }
}


public class JMetaCompiler extends BaseParser {  public Object jpackage =  null;
  public boolean embedded =  false;
  public ArrayList locals =  new ArrayList();
  public ArrayList methods =  new ArrayList();
  public ArrayList rules =  new ArrayList();
  public void reset() {
        locals = new ArrayList();
        methods = new ArrayList();
        rules = new ArrayList();
    }
  public String sname =  "ERROR-sname-ERROR";
  public String name =  "ERROR-name-ERROR";
  public void addLocal(Object n) {
        String s = ((String)n).intern();
        if (! locals.contains(s)) locals.add(s);
    }
  public String localsAsArgs() {
        if (locals.size() == 0) return "";
        return "Object "+ join(locals, ", Object ");
    }
  public String localsAsCall() {
        return join(locals, ",");
    }
  public String localsAsInit() {
        if (locals.size() == 0) return "";
        String res = "Object "+ join(locals, "=null; Object ") + "=null;";
        locals.clear();
        return res;
    }
  public String w(Object... as) {
        StringBuffer sb = new StringBuffer();
        for (Object a : as) sb.append(a);
        return sb.toString();
    }
  public String _ =  "  ";
  public Object indent() { _ = _ + "  "; return _; }
  public Object outdent() { _ = _.substring(2); return _; }
  public int __genc =  0;
  public String genvar() { return ""+ __genc++; }

  public Object destruct() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"destruct"); if (_t!=NOT_MEMOIZED) return _t;
    Object t=null; Object r=null;    do {
    { int _p0=_pos; _t=ERROR; do { //and
    _t=_any();
    t=_t;
    if (_t==ERROR) throw new SyntaxError("", _pos, _string, _list);
    _push(t); _t=apply();
    r=_t;
    if (_t==ERROR) throw new SyntaxError("", _pos, _string, _list);
    _t=end();
    if (_t==ERROR) throw new SyntaxError("", _pos, _string, _list);
    _t=r;
    if (_t==ERROR) throw new SyntaxError("", _pos, _string, _list);
  } while(false); if (_t==ERROR) _pos=_p0; }
    _t=_memoize("JMetaCompiler"+"."+"destruct", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="destruct"; return _t;
  }
  public Object trans() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"trans"); if (_t!=NOT_MEMOIZED) return _t;
    Object r=null;    do {
    { int _p1=_pos; _t=ERROR; do { //and
    _t=_listBegin(); if (_t!=ERROR) {
      _t=destruct();
      r=_t;
    _listEnd(); }
    if (_t==ERROR) break;
    _t=r;
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p1; }
    _t=_memoize("JMetaCompiler"+"."+"trans", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="trans"; return _t;
  }
  public Object HList() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"HList"); if (_t!=NOT_MEMOIZED) return _t;
    Object ls=null;    do {
    { int _p4=_pos; _t=ERROR; do { //and
    java.util.ArrayList<Object> as2=new java.util.ArrayList<Object>();
    while (true) { //many
    _t=trans();
    if (_t==ERROR) break; else as2.add(_t);
    } _t=as2;
    ls=_t;
    if (_t==ERROR) break;
    _t=__act3(ls);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p4; }
    _t=_memoize("JMetaCompiler"+"."+"HList", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="HList"; return _t;
  }
  public Object HConcat() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"HConcat"); if (_t!=NOT_MEMOIZED) return _t;
    Object l=null; Object r=null;    do {
    { int _p6=_pos; _t=ERROR; do { //and
    _t=trans();
    l=_t;
    if (_t==ERROR) break;
    _t=trans();
    r=_t;
    if (_t==ERROR) break;
    _t=__act5(l,r);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p6; }
    _t=_memoize("JMetaCompiler"+"."+"HConcat", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="HConcat"; return _t;
  }
  public Object HStr() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"HStr"); if (_t!=NOT_MEMOIZED) return _t;
    Object c=null;    do {
    { int _p8=_pos; _t=ERROR; do { //and
    _t=_any();
    c=_t;
    if (_t==ERROR) break;
    _t=__act7(c);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p8; }
    _t=_memoize("JMetaCompiler"+"."+"HStr", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="HStr"; return _t;
  }
  public Object HLit() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"HLit"); if (_t!=NOT_MEMOIZED) return _t;
    Object c=null;    do {
    { int _p9=_pos; _t=ERROR; do { //and
    _t=_any();
    c=_t;
    if (_t==ERROR) break;
    _t=c;
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p9; }
    _t=_memoize("JMetaCompiler"+"."+"HLit", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="HLit"; return _t;
  }
  public Object Error() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"Error"); if (_t!=NOT_MEMOIZED) return _t;
    Object msg=null;    do {
    { int _p11=_pos; _t=ERROR; do { //and
    _t=_any();
    msg=_t;
    if (_t==ERROR) break;
    _t=__act10(msg);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p11; }
    _t=_memoize("JMetaCompiler"+"."+"Error", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="Error"; return _t;
  }
  public Object Set() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"Set"); if (_t!=NOT_MEMOIZED) return _t;
    Object n=null; Object x=null;    do {
    { int _p13=_pos; _t=ERROR; do { //and
    _t=_any();
    n=_t;
    if (_t==ERROR) break;
    _t=trans();
    x=_t;
    if (_t==ERROR) break;
    _t=__act12(n,x);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p13; }
    _t=_memoize("JMetaCompiler"+"."+"Set", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="Set"; return _t;
  }
  public Object Str() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"Str"); if (_t!=NOT_MEMOIZED) return _t;
    Object s=null;    do {
    { int _p15=_pos; _t=ERROR; do { //and
    _t=_any();
    s=_t;
    if (_t==ERROR) break;
    _t=__act14(s);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p15; }
    _t=_memoize("JMetaCompiler"+"."+"Str", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="Str"; return _t;
  }
  public Object Sym() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"Sym"); if (_t!=NOT_MEMOIZED) return _t;
    Object s=null;    do {
    { int _p17=_pos; _t=ERROR; do { //and
    _t=_any();
    s=_t;
    if (_t==ERROR) break;
    _t=__act16(s);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p17; }
    _t=_memoize("JMetaCompiler"+"."+"Sym", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="Sym"; return _t;
  }
  public Object App() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"App"); if (_t!=NOT_MEMOIZED) return _t;
    Object rule=null; Object args=null;    do {
    _t=ERROR; do{ //or
    { int _p20=_pos; _t=ERROR; do { //and
      _t=_sym("super");
      if (_t==ERROR) break;
      _t=_any();
      rule=_t;
      if (_t==ERROR) break;
      java.util.ArrayList<Object> as18=new java.util.ArrayList<Object>();
      _t=trans();
      if (_t!=ERROR) { as18.add(_t);
        while (true) { //many
        _t=trans();
        if (_t==ERROR) break; else as18.add(_t);
        } _t=as18;
      }
      args=_t;
      if (_t==ERROR) break;
      _t=__act19(rule,args);
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p20; }
    if (_t!=ERROR) break;

    { int _p22=_pos; _t=ERROR; do { //and
      _t=_sym("super");
      if (_t==ERROR) break;
      _t=_any();
      rule=_t;
      if (_t==ERROR) break;
      _t=__act21(rule,args);
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p22; }
    if (_t!=ERROR) break;

    { int _p25=_pos; _t=ERROR; do { //and
      _t=_any();
      rule=_t;
      if (_t==ERROR) break;
      java.util.ArrayList<Object> as23=new java.util.ArrayList<Object>();
      _t=trans();
      if (_t!=ERROR) { as23.add(_t);
        while (true) { //many
        _t=trans();
        if (_t==ERROR) break; else as23.add(_t);
        } _t=as23;
      }
      args=_t;
      if (_t==ERROR) break;
      _t=__act24(rule,args);
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p25; }
    if (_t!=ERROR) break;

    { int _p27=_pos; _t=ERROR; do { //and
      _t=_any();
      rule=_t;
      if (_t==ERROR) break;
      _t=__act26(rule,args);
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p27; }
    if (_t!=ERROR) break;
  } while(false);
    _t=_memoize("JMetaCompiler"+"."+"App", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="App"; return _t;
  }
  public Object Dot() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"Dot"); if (_t!=NOT_MEMOIZED) return _t;
        do {
    _t=__act28();
    _t=_memoize("JMetaCompiler"+"."+"Dot", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="Dot"; return _t;
  }
  public Object SAct() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"SAct"); if (_t!=NOT_MEMOIZED) return _t;
    Object expr=null;    do {
    { int _p30=_pos; _t=ERROR; do { //and
    _t=trans();
    expr=_t;
    if (_t==ERROR) break;
    _t=__act29(expr);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p30; }
    _t=_memoize("JMetaCompiler"+"."+"SAct", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="SAct"; return _t;
  }
  public Object Act() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"Act"); if (_t!=NOT_MEMOIZED) return _t;
    Object expr=null;    do {
    { int _p32=_pos; _t=ERROR; do { //and
    _t=_any();
    expr=_t;
    if (_t==ERROR) break;
    _t=__act31(expr);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p32; }
    _t=_memoize("JMetaCompiler"+"."+"Act", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="Act"; return _t;
  }
  public Object Pred() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"Pred"); if (_t!=NOT_MEMOIZED) return _t;
    Object expr=null;    do {
    { int _p34=_pos; _t=ERROR; do { //and
    _t=_any();
    expr=_t;
    if (_t==ERROR) break;
    _t=__act33(expr);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p34; }
    _t=_memoize("JMetaCompiler"+"."+"Pred", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="Pred"; return _t;
  }
  public Object Or() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"Or"); if (_t!=NOT_MEMOIZED) return _t;
    Object x=null; Object xs=null;    do {
    { int _p39=_pos; _t=ERROR; do { //and
    _t=indent();
    if (_t==ERROR) break;
    java.util.ArrayList<Object> as37=new java.util.ArrayList<Object>();
    while (true) { //many
    { int _p36=_pos; _t=ERROR; do { //and
        _t=trans();
        x=_t;
        if (_t==ERROR) break;
        _t=__act35(x);
        if (_t==ERROR) break;
      } while(false); if (_t==ERROR) _pos=_p36; }
    if (_t==ERROR) break; else as37.add(_t);
    } _t=as37;
    xs=_t;
    if (_t==ERROR) break;
    _t=outdent();
    if (_t==ERROR) break;
    _t=__act38(x,xs);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p39; }
    _t=_memoize("JMetaCompiler"+"."+"Or", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="Or"; return _t;
  }
  public Object And() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"And"); if (_t!=NOT_MEMOIZED) return _t;
    Object ts=null;    do {
    _t=ERROR; do{ //or
    { int _p42=_pos; _t=ERROR; do { //and
      _t=indent();
      if (_t==ERROR) break;
      java.util.ArrayList<Object> as40=new java.util.ArrayList<Object>();
      _t=trans();
      if (_t!=ERROR) { as40.add(_t);
        while (true) { //many
        _t=trans();
        if (_t==ERROR) break; else as40.add(_t);
        } _t=as40;
      }
      ts=_t;
      if (_t==ERROR) break;
      _t=__act41(ts);
      if (_t==ERROR) break;
    } while(false); if (_t==ERROR) _pos=_p42; }
    if (_t!=ERROR) break;

    _t=__act43(ts);
    if (_t!=ERROR) break;
  } while(false);
    _t=_memoize("JMetaCompiler"+"."+"And", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="And"; return _t;
  }  public String makeMany(Object x, boolean many1) {
        String var = genvar();
        String b = "";
        b = w(b,
            "java.util.ArrayList<Object> as", var, "=new java.util.ArrayList<Object>();\n"
        );
        if (many1) { b = w(b,
            _, x, "\n",
            _, "if (_t!=ERROR) { as", var, ".add(_t);\n"
        ); indent();}

        b = w(b,
            _, "while (true) { //many\n",
            _, x, "\n",
            _, "if (_t==ERROR) break; else as", var, ".add(_t);\n",
            _, "} _t=as", var, ";"
        );

        if (many1) { outdent(); b= w(b,
            "\n",
            _, "}"
        );};
        return b;
    }

  public Object Many() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"Many"); if (_t!=NOT_MEMOIZED) return _t;
    Object x=null;    do {
    { int _p45=_pos; _t=ERROR; do { //and
    _t=indent();
    if (_t==ERROR) break;
    _t=trans();
    x=_t;
    if (_t==ERROR) break;
    _t=outdent();
    if (_t==ERROR) break;
    _t=__act44(x);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p45; }
    _t=_memoize("JMetaCompiler"+"."+"Many", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="Many"; return _t;
  }
  public Object Many1() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"Many1"); if (_t!=NOT_MEMOIZED) return _t;
    Object x=null;    do {
    { int _p47=_pos; _t=ERROR; do { //and
    _t=indent();
    if (_t==ERROR) break;
    _t=trans();
    x=_t;
    if (_t==ERROR) break;
    _t=outdent();
    if (_t==ERROR) break;
    _t=__act46(x);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p47; }
    _t=_memoize("JMetaCompiler"+"."+"Many1", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="Many1"; return _t;
  }
  public Object Opt() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"Opt"); if (_t!=NOT_MEMOIZED) return _t;
    Object x=null;    do {
    { int _p49=_pos; _t=ERROR; do { //and
    _t=indent();
    if (_t==ERROR) break;
    _t=trans();
    x=_t;
    if (_t==ERROR) break;
    _t=outdent();
    if (_t==ERROR) break;
    _t=__act48(x);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p49; }
    _t=_memoize("JMetaCompiler"+"."+"Opt", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="Opt"; return _t;
  }
  public Object Not() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"Not"); if (_t!=NOT_MEMOIZED) return _t;
    Object x=null;    do {
    { int _p51=_pos; _t=ERROR; do { //and
    _t=trans();
    x=_t;
    if (_t==ERROR) break;
    _t=__act50(x);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p51; }
    _t=_memoize("JMetaCompiler"+"."+"Not", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="Not"; return _t;
  }
  public Object Peek() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"Peek"); if (_t!=NOT_MEMOIZED) return _t;
    Object x=null;    do {
    { int _p53=_pos; _t=ERROR; do { //and
    _t=trans();
    x=_t;
    if (_t==ERROR) break;
    _t=__act52(x);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p53; }
    _t=_memoize("JMetaCompiler"+"."+"Peek", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="Peek"; return _t;
  }
  public Object List() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"List"); if (_t!=NOT_MEMOIZED) return _t;
    Object x=null;    do {
    { int _p55=_pos; _t=ERROR; do { //and
    _t=indent();
    if (_t==ERROR) break;
    _t=trans();
    x=_t;
    if (_t==ERROR) break;
    _t=outdent();
    if (_t==ERROR) break;
    _t=__act54(x);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p55; }
    _t=_memoize("JMetaCompiler"+"."+"List", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="List"; return _t;
  }
  public Object Rule() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"Rule"); if (_t!=NOT_MEMOIZED) return _t;
    Object n=null; Object b=null;    do {
    { int _p57=_pos; _t=ERROR; do { //and
    _t=_any();
    n=_t;
    if (_t==ERROR) break;
    _t=trans();
    b=_t;
    if (_t==ERROR) break;
    _t=__act56(n,b);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p57; }
    _t=_memoize("JMetaCompiler"+"."+"Rule", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="Rule"; return _t;
  }
  public Object Parser() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"Parser"); if (_t!=NOT_MEMOIZED) return _t;
    Object p=null; Object n=null; Object s=null; Object xs=null;    do {
    { int _p61=_pos; _t=ERROR; do { //and
    _t=_any();
    p=_t;
    if (_t==ERROR) break;
    _t=_any();
    n=_t;
    if (_t==ERROR) break;
    _t=_any();
    s=_t;
    if (_t==ERROR) break;
    _t=__act58(p,n,s);
    if (_t==ERROR) break;
    java.util.ArrayList<Object> as59=new java.util.ArrayList<Object>();
    while (true) { //many
    _t=trans();
    if (_t==ERROR) break; else as59.add(_t);
    } _t=as59;
    xs=_t;
    if (_t==ERROR) break;
    _t=__act60(p,n,s,xs);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p61; }
    _t=_memoize("JMetaCompiler"+"."+"Parser", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="Parser"; return _t;
  }
  public Object Method() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"Method"); if (_t!=NOT_MEMOIZED) return _t;
    Object c=null;    do {
    { int _p63=_pos; _t=ERROR; do { //and
    _t=_any();
    c=_t;
    if (_t==ERROR) break;
    _t=__act62(c);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p63; }
    _t=_memoize("JMetaCompiler"+"."+"Method", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="Method"; return _t;
  }
  public Object Field() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"Field"); if (_t!=NOT_MEMOIZED) return _t;
    Object c=null;    do {
    { int _p65=_pos; _t=ERROR; do { //and
    _t=_any();
    c=_t;
    if (_t==ERROR) break;
    _t=__act64(c);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p65; }
    _t=_memoize("JMetaCompiler"+"."+"Field", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="Field"; return _t;
  }
  public Object Package() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"Package"); if (_t!=NOT_MEMOIZED) return _t;
    Object c=null;    do {
    { int _p67=_pos; _t=ERROR; do { //and
    _t=_any();
    c=_t;
    if (_t==ERROR) break;
    _t=__act66(c);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p67; }
    _t=_memoize("JMetaCompiler"+"."+"Package", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="Package"; return _t;
  }
  public Object Import() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"Import"); if (_t!=NOT_MEMOIZED) return _t;
    Object c=null;    do {
    { int _p68=_pos; _t=ERROR; do { //and
    _t=_any();
    c=_t;
    if (_t==ERROR) break;
    _t=c;
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p68; }
    _t=_memoize("JMetaCompiler"+"."+"Import", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="Import"; return _t;
  }
  public Object Class() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"Class"); if (_t!=NOT_MEMOIZED) return _t;
    Object q=null; Object d=null; Object c=null;    do {
    { int _p70=_pos; _t=ERROR; do { //and
    _t=_any();
    q=_t;
    if (_t==ERROR) break;
    _t=_any();
    d=_t;
    if (_t==ERROR) break;
    _t=_any();
    c=_t;
    if (_t==ERROR) break;
    _t=__act69(q,d,c);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p70; }
    _t=_memoize("JMetaCompiler"+"."+"Class", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="Class"; return _t;
  }
  public Object Line() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"Line"); if (_t!=NOT_MEMOIZED) return _t;
    Object ws=null; Object x=null;    do {
    { int _p72=_pos; _t=ERROR; do { //and
    _t=_any();
    ws=_t;
    if (_t==ERROR) break;
    _t=trans();
    x=_t;
    if (_t==ERROR) break;
    _t=__act71(ws,x);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p72; }
    _t=_memoize("JMetaCompiler"+"."+"Line", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="Line"; return _t;
  }
  public Object File() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"File"); if (_t!=NOT_MEMOIZED) return _t;
    Object xs=null;    do {
    { int _p75=_pos; _t=ERROR; do { //and
    java.util.ArrayList<Object> as73=new java.util.ArrayList<Object>();
    while (true) { //many
    _t=trans();
    if (_t==ERROR) break; else as73.add(_t);
    } _t=as73;
    xs=_t;
    if (_t==ERROR) break;
    _t=__act74(xs);
    if (_t==ERROR) break;
  } while(false); if (_t==ERROR) _pos=_p75; }
    _t=_memoize("JMetaCompiler"+"."+"File", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="File"; return _t;
  }
  public Object start() { Object _t=null; int _start=_pos;
    _t=_retrieve("JMetaCompiler"+"."+"start"); if (_t!=NOT_MEMOIZED) return _t;
    Object r=null;    do {
    { int _p76=_pos; _t=ERROR; do { //and
    _t=destruct();
    r=_t;
    if (_t==ERROR) throw new SyntaxError("", _pos, _string, _list);
    _t=end();
    if (_t==ERROR) throw new SyntaxError("", _pos, _string, _list);
    _t=r;
    if (_t==ERROR) throw new SyntaxError("", _pos, _string, _list);
  } while(false); if (_t==ERROR) _pos=_p76; }
    _t=_memoize("JMetaCompiler"+"."+"start", _start, _t);
    } while (_t==GROW); if (_t==ERROR) ERROR.last="start"; return _t;
  }
Object __act3(Object ls){ return w(
        "new Object[] {", join(ls, ", "), "}"
    ); }
Object __act5(Object l, Object r){ return w(
        "concat(", l, ",", r, ")"
    ); }
Object __act7(Object c){ return "\""+ c +"\""; }
Object __act10(Object msg){
        return new DoError(msg);
    }
Object __act12(Object n, Object x){
        addLocal(n);
        return w(
            x, "\n",
            _, n, "=_t;"
        );
    }
Object __act14(Object s){ return w(
        "_t=_str(\"", s, "\");"
    ); }
Object __act16(Object s){ return w(
        "_t=_sym(\"", s, "\");"
    ); }
Object __act19(Object rule, Object args){ return w(
        "_push(", join(args, ", "), "); _t=super.", rule, "();"
    ); }
Object __act21(Object rule, Object args){ return w(
        "_t=super.", rule, "();"
    ); }
Object __act24(Object rule, Object args){return w(
        "_push(", join(args, ", "), "); _t=", rule, "();"
    ); }
Object __act26(Object rule, Object args){ return w(
        "_t=", rule, "();"
    ); }
Object __act28(){ return w(
        "_t=ws();"
    ); }
Object __act29(Object expr){ return w(
        "_t=", expr, ";"
    ); }
Object __act31(Object expr){
        String var = genvar();
        methods.add(w(
            "Object __act", var, "(", localsAsArgs(), "){", expr, "}\n"
        ));
        return w(
            "_t=__act", var, "(", localsAsCall(), ");"
        );
    }
Object __act33(Object expr){
        String var = genvar();
        methods.add(w(
            "boolean __pred", var, "(", localsAsArgs(), "){", expr, "}\n"
        ));
        return w(
            "if (!__pred", var, "(", localsAsCall(), ")) _t=ERROR;"
        );
    }
Object __act35(Object x){ return w(
        _, x, "\n",
        _, "if (_t!=ERROR) break;\n"
    ); }
Object __act38(Object x, Object xs){ return w(
        "_t=ERROR; do{ //or\n",
        join(xs, "\n"),
        _, "} while(false);"
    ); }
Object __act41(Object ts){
        String var = genvar();
        String err = null;
        Object[] xs = ((ArrayList) ts).toArray();
        String b = w(
            "{ int _p", var, "=_pos; _t=ERROR; do { //and\n"
        );
        for (int i = 0; i < xs.length; i++) {
            Object x = xs[i];
            if (x instanceof DoError) { err = ((DoError)x).msg; continue; }
            if (err != null) { b = w(b,
                _, x, "\n",
                _, "if (_t==ERROR) throw new SyntaxError(\"", err, "\", _pos, _string, _list);\n"
            ); } else { b = w(b,
                _, x, "\n",
                _, "if (_t==ERROR) break;\n"
            ); }
        }
        outdent();
        return w(b,
            _, "} while(false); if (_t==ERROR) _pos=_p", var, "; }"
        );
    }
Object __act43(Object ts){ return w(
        ""
    );}
Object __act44(Object x){ return makeMany(x, false); }
Object __act46(Object x){ return makeMany(x, true);  }
Object __act48(Object x){ return w(
        _, x, "\n",
        _, "if (_t==ERROR) if (_string != null) { _t=\"\"; } else { _t=null; }"
    ); }
Object __act50(Object x){ return w(
        _, x, "\n",
        _, "if (_t==ERROR) { _t=true; } else { _t=ERROR; }"
    );}
Object __act52(Object x){ String var = genvar(); return w(
        "{ int _l", var, "=_pos;\n",
        _, x, "\n",
        _, "if (_t!=ERROR) { _pos=_l", var, "; }}"
    );}
Object __act54(Object x){ return w(
        "_t=_listBegin(); if (_t!=ERROR) {\n",
        _, "  ", x, "\n",
        _, "_listEnd(); }"
    );}
Object __act56(Object n, Object b){ rules.add(n); return w(
        "\n",
        "  public Object ", n, "() { Object _t=null; int _start=_pos;\n",
        "    _t=_retrieve(\"", name, "\"+\".\"+\"", n, "\"); if (_t!=NOT_MEMOIZED) return _t;\n",
        "    ", localsAsInit(),
        "    do {\n",
        "    ", b, "\n",
        "    _t=_memoize(\"", name, "\"+\".\"+\"", n, "\", _start, _t);\n",
        "    } while (_t==GROW); if (_t==ERROR) ERROR.last=\"", n, "\"; return _t;\n",
        "  }"
    );}
Object __act58(Object p, Object n, Object s){ name = (String)n; sname = (String)s; return null; }
Object __act60(Object p, Object n, Object s, Object xs){
        String b = "\n";
        b = w(b,
            p, " class ", name, " extends ", sname, " {",
            join(xs), "\n",
            join(methods), "\n",

            "  public Object _jump(String r) {\n"
        );

        for (Object r : rules) { b = w(b,
            "    if (r==\"", r, "\") return ", r, "();\n"
        );}
        b = w(b,
            "    return super._jump(r);\n",
            "  }\n",

            "  public boolean _has(String r) {\n"
        );
        for (Object r : rules) { b = w(b,
            "    if (r==\"", r, "\") return true;\n"
        );}
        b = w(b,
            "    return super._has(r);\n",
            "  }\n",

            "}\n"
        );
        reset();
        return b;
    }
Object __act62(Object c){ return w("  ", c, "\n"); }
Object __act64(Object c){ return w("  ", c, "\n"); }
Object __act66(Object c){ jpackage = c; return ""; }
Object __act69(Object q, Object d, Object c){ return "" + q + d + "{" + c + "}"; }
Object __act71(Object ws, Object x){ return w(ws, x); }
Object __act74(Object xs){ return w(
        (jpackage != null)?(jpackage+"\n"):"",
        "// generated by jmeta on ", new Date(), "\n",
        "// do not modify, instead edit original .jmeta file\n",
        (!embedded)?"import jmeta.*;\n":"",
        join(xs));
    }

  public Object _jump(String r) {
    if (r=="destruct") return destruct();
    if (r=="trans") return trans();
    if (r=="HList") return HList();
    if (r=="HConcat") return HConcat();
    if (r=="HStr") return HStr();
    if (r=="HLit") return HLit();
    if (r=="Error") return Error();
    if (r=="Set") return Set();
    if (r=="Str") return Str();
    if (r=="Sym") return Sym();
    if (r=="App") return App();
    if (r=="Dot") return Dot();
    if (r=="SAct") return SAct();
    if (r=="Act") return Act();
    if (r=="Pred") return Pred();
    if (r=="Or") return Or();
    if (r=="And") return And();
    if (r=="Many") return Many();
    if (r=="Many1") return Many1();
    if (r=="Opt") return Opt();
    if (r=="Not") return Not();
    if (r=="Peek") return Peek();
    if (r=="List") return List();
    if (r=="Rule") return Rule();
    if (r=="Parser") return Parser();
    if (r=="Method") return Method();
    if (r=="Field") return Field();
    if (r=="Package") return Package();
    if (r=="Import") return Import();
    if (r=="Class") return Class();
    if (r=="Line") return Line();
    if (r=="File") return File();
    if (r=="start") return start();
    return super._jump(r);
  }
  public boolean _has(String r) {
    if (r=="destruct") return true;
    if (r=="trans") return true;
    if (r=="HList") return true;
    if (r=="HConcat") return true;
    if (r=="HStr") return true;
    if (r=="HLit") return true;
    if (r=="Error") return true;
    if (r=="Set") return true;
    if (r=="Str") return true;
    if (r=="Sym") return true;
    if (r=="App") return true;
    if (r=="Dot") return true;
    if (r=="SAct") return true;
    if (r=="Act") return true;
    if (r=="Pred") return true;
    if (r=="Or") return true;
    if (r=="And") return true;
    if (r=="Many") return true;
    if (r=="Many1") return true;
    if (r=="Opt") return true;
    if (r=="Not") return true;
    if (r=="Peek") return true;
    if (r=="List") return true;
    if (r=="Rule") return true;
    if (r=="Parser") return true;
    if (r=="Method") return true;
    if (r=="Field") return true;
    if (r=="Package") return true;
    if (r=="Import") return true;
    if (r=="Class") return true;
    if (r=="Line") return true;
    if (r=="File") return true;
    if (r=="start") return true;
    return super._has(r);
  }
}
