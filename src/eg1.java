/* Generated By:JavaCC: Do not edit this line. eg1.java */
public class eg1 implements eg1Constants {
  public static void main(String args []) throws ParseException
  {
    eg1 parser = new eg1(System.in);
    while (true)
    {
      try
      {
        //eg1.Goal();
        switch (eg1.Goal())
        {
          case 0 :
          System.out.println("OK.");
          break;
          case 1 :
          System.out.println("Goodbye.");
          break;
          default :
          break;
        }
      }
      catch (Exception e)
      {
        System.out.println("NOK.");
        System.out.println(e.getMessage());
        eg1.ReInit(System.in);
      }
      catch (Error e)
      {
        System.out.println("Oops.");
        System.out.println(e.getMessage());
        break;
      }
    }
  }

  static final public int Goal() throws ParseException {
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CLASS:
        MainClass();
        label_1:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case CLASS:
            ;
            break;
          default:
            jj_la1[0] = jj_gen;
            break label_1;
          }
          ClassDeclaration();
        }
        jj_consume_token(0);
        {if (true) return 0;}
        break;
      case 0:
        jj_consume_token(0);
                {if (true) return 1;}
        break;
      default:
        jj_la1[1] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } catch (ParseException e) {
        System.out.println(e.toString());
        Token t;
    do {
      t = getNextToken();
    } while (t.kind != EOF);
    }
    throw new Error("Missing return statement in function");
  }

  static final public void MainClass() throws ParseException {
    try {
      jj_consume_token(CLASS);
      Identifier();
      jj_consume_token(LBRACE);
      jj_consume_token(PUBLIC);
      jj_consume_token(STATIC);
      jj_consume_token(VOID);
      jj_consume_token(MAIN);
      jj_consume_token(LPAREN);
      jj_consume_token(STRING);
      jj_consume_token(LBRACKET);
      jj_consume_token(RBRACKET);
      Identifier();
      jj_consume_token(RPAREN);
      jj_consume_token(LBRACE);
      Statement();
      jj_consume_token(RBRACE);
      jj_consume_token(RBRACE);
    } catch (ParseException e) {
                System.out.println(e.toString());
                Token t;
                do {
                        t = getNextToken();
                } while (t.kind != CLASS && t.kind != EOF);
    }
  }

  static final public void ClassDeclaration() throws ParseException {
    try {
      jj_consume_token(CLASS);
      Identifier();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case EXTENDS:
        jj_consume_token(EXTENDS);
        Identifier();
        break;
      default:
        jj_la1[2] = jj_gen;
        ;
      }
      jj_consume_token(LBRACE);
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case INT:
        case BOOLEAN:
        case IDENTIFIER:
          ;
          break;
        default:
          jj_la1[3] = jj_gen;
          break label_2;
        }
        VarDeclaration();
      }
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PUBLIC:
          ;
          break;
        default:
          jj_la1[4] = jj_gen;
          break label_3;
        }
        MethodDeclaration();
      }
      jj_consume_token(RBRACE);
    } catch (ParseException e) {
                System.out.println(e.toString());
                Token t;
                do {
                        t = getNextToken();
                } while (t.kind != RBRACE);
    }
  }

  static final public void VarDeclaration() throws ParseException {
    try {
      Type();
      Identifier();
      jj_consume_token(SEMICOLON);
    } catch (ParseException e) {
        System.out.println(e.toString());
        Token t;
    do {
      t = getNextToken();
    } while (t.kind != SEMICOLON);
    }
  }

  static final public void MethodDeclaration() throws ParseException {
    jj_consume_token(PUBLIC);
    Type();
    Identifier();
    jj_consume_token(LPAREN);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INT:
    case BOOLEAN:
    case IDENTIFIER:
      Type();
      Identifier();
      label_4:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case COMMA:
          ;
          break;
        default:
          jj_la1[5] = jj_gen;
          break label_4;
        }
        jj_consume_token(COMMA);
        Type();
        Identifier();
      }
      break;
    default:
      jj_la1[6] = jj_gen;
      ;
    }
    jj_consume_token(RPAREN);
    jj_consume_token(LBRACE);
    label_5:
    while (true) {
      if (jj_2_1(2)) {
        ;
      } else {
        break label_5;
      }
      VarDeclaration();
    }
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IF:
      case WHILE:
      case PRINT:
      case IDENTIFIER:
      case LBRACE:
        ;
        break;
      default:
        jj_la1[7] = jj_gen;
        break label_6;
      }
      Statement();
    }
    jj_consume_token(RETURN);
    Expression();
    jj_consume_token(SEMICOLON);
    jj_consume_token(RBRACE);
  }

  static final public void Type() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INT:
      jj_consume_token(INT);
      TypeLine();
      break;
    case BOOLEAN:
      jj_consume_token(BOOLEAN);
      break;
    case IDENTIFIER:
      Identifier();
      break;
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void TypeLine() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LBRACKET:
      jj_consume_token(LBRACKET);
      jj_consume_token(RBRACKET);
      break;
    default:
      jj_la1[9] = jj_gen;
      ;
    }
  }

  static final public void Statement() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LBRACE:
      jj_consume_token(LBRACE);
      label_7:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case IF:
        case WHILE:
        case PRINT:
        case IDENTIFIER:
        case LBRACE:
          ;
          break;
        default:
          jj_la1[10] = jj_gen;
          break label_7;
        }
        Statement();
      }
      jj_consume_token(RBRACE);
      break;
    case IF:
      jj_consume_token(IF);
      jj_consume_token(LPAREN);
      Expression();
      jj_consume_token(RPAREN);
      Statement();
      jj_consume_token(ELSE);
      Statement();
      break;
    case WHILE:
      jj_consume_token(WHILE);
      jj_consume_token(LPAREN);
      Expression();
      jj_consume_token(RPAREN);
      Statement();
      break;
    case PRINT:
      jj_consume_token(PRINT);
      jj_consume_token(LPAREN);
      Expression();
      jj_consume_token(RPAREN);
      jj_consume_token(SEMICOLON);
      break;
    case IDENTIFIER:
      Identifier();
      StatementLine();
      break;
    default:
      jj_la1[11] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void StatementLine() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case ASSIGN:
      jj_consume_token(ASSIGN);
      Expression();
      jj_consume_token(SEMICOLON);
      break;
    case LBRACKET:
      jj_consume_token(LBRACKET);
      Expression();
      jj_consume_token(RBRACKET);
      jj_consume_token(ASSIGN);
      Expression();
      jj_consume_token(SEMICOLON);
      break;
    default:
      jj_la1[12] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void Expression() throws ParseException {
    AExpression();
    if (jj_2_2(2)) {
      ExpressionLine();
    } else {
      ;
    }
  }

  static final public void ExpressionLine() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case STAR:
    case AND:
    case LESS:
    case PLUS:
    case MINUS:
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case AND:
        jj_consume_token(AND);
        break;
      case LESS:
        jj_consume_token(LESS);
        break;
      case PLUS:
        jj_consume_token(PLUS);
        break;
      case MINUS:
        jj_consume_token(MINUS);
        break;
      case STAR:
        jj_consume_token(STAR);
        break;
      default:
        jj_la1[13] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      Expression();
      if (jj_2_3(2)) {
        ExpressionLine();
      } else {
        ;
      }
      break;
    case LBRACKET:
      jj_consume_token(LBRACKET);
      Expression();
      jj_consume_token(RBRACKET);
      if (jj_2_4(2)) {
        ExpressionLine();
      } else {
        ;
      }
      break;
    case PERIOD:
      jj_consume_token(PERIOD);
      ExpressionLineTwo();
      break;
    default:
      jj_la1[14] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void ExpressionLineTwo() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LENGTH:
      jj_consume_token(LENGTH);
      if (jj_2_5(2)) {
        ExpressionLine();
      } else {
        ;
      }
      break;
    case IDENTIFIER:
      Identifier();
      jj_consume_token(LPAREN);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case NEW:
      case TRUE:
      case THIS:
      case FALSE:
      case IDENTIFIER:
      case INTEGER:
      case LPAREN:
      case NOT:
        Expression();
        label_8:
        while (true) {
          switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
          case COMMA:
            ;
            break;
          default:
            jj_la1[15] = jj_gen;
            break label_8;
          }
          jj_consume_token(COMMA);
          Expression();
        }
        break;
      default:
        jj_la1[16] = jj_gen;
        ;
      }
      jj_consume_token(RPAREN);
      if (jj_2_6(2)) {
        ExpressionLine();
      } else {
        ;
      }
      break;
    default:
      jj_la1[17] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void AExpression() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INTEGER:
      jj_consume_token(INTEGER);
      break;
    case TRUE:
      jj_consume_token(TRUE);
      break;
    case FALSE:
      jj_consume_token(FALSE);
      break;
    case IDENTIFIER:
      Identifier();
      break;
    case THIS:
      jj_consume_token(THIS);
      break;
    case NEW:
      jj_consume_token(NEW);
      NewLine();
      break;
    case NOT:
      jj_consume_token(NOT);
      Expression();
      break;
    case LPAREN:
      jj_consume_token(LPAREN);
      Expression();
      jj_consume_token(RPAREN);
      break;
    default:
      jj_la1[18] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void NewLine() throws ParseException {
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case INT:
      jj_consume_token(INT);
      jj_consume_token(LBRACKET);
      Expression();
      jj_consume_token(RBRACKET);
      break;
    case IDENTIFIER:
      Identifier();
      jj_consume_token(LPAREN);
      jj_consume_token(RPAREN);
      break;
    default:
      jj_la1[19] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public void Identifier() throws ParseException {
    jj_consume_token(IDENTIFIER);
  }

  static private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  static private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  static private boolean jj_2_3(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  static private boolean jj_2_4(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  static private boolean jj_2_5(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_5(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(4, xla); }
  }

  static private boolean jj_2_6(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_6(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(5, xla); }
  }

  static private boolean jj_3R_11() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_15()) {
    jj_scanpos = xsp;
    if (jj_scan_token(15)) {
    jj_scanpos = xsp;
    if (jj_scan_token(30)) return true;
    }
    }
    return false;
  }

  static private boolean jj_3R_15() {
    if (jj_scan_token(INT)) return true;
    if (jj_3R_18()) return true;
    return false;
  }

  static private boolean jj_3_2() {
    if (jj_3R_10()) return true;
    return false;
  }

  static private boolean jj_3_1() {
    if (jj_3R_9()) return true;
    return false;
  }

  static private boolean jj_3R_14() {
    if (jj_scan_token(PERIOD)) return true;
    if (jj_3R_17()) return true;
    return false;
  }

  static private boolean jj_3R_13() {
    if (jj_scan_token(LBRACKET)) return true;
    if (jj_3R_16()) return true;
    return false;
  }

  static private boolean jj_3R_10() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_12()) {
    jj_scanpos = xsp;
    if (jj_3R_13()) {
    jj_scanpos = xsp;
    if (jj_3R_14()) return true;
    }
    }
    return false;
  }

  static private boolean jj_3R_12() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(37)) {
    jj_scanpos = xsp;
    if (jj_scan_token(39)) {
    jj_scanpos = xsp;
    if (jj_scan_token(41)) {
    jj_scanpos = xsp;
    if (jj_scan_token(43)) {
    jj_scanpos = xsp;
    if (jj_scan_token(33)) return true;
    }
    }
    }
    }
    if (jj_3R_16()) return true;
    return false;
  }

  static private boolean jj_3R_16() {
    if (jj_3R_19()) return true;
    return false;
  }

  static private boolean jj_3R_25() {
    if (jj_scan_token(LPAREN)) return true;
    return false;
  }

  static private boolean jj_3R_9() {
    if (jj_3R_11()) return true;
    if (jj_scan_token(30)) return true;
    return false;
  }

  static private boolean jj_3R_24() {
    if (jj_scan_token(NOT)) return true;
    return false;
  }

  static private boolean jj_3R_23() {
    if (jj_scan_token(NEW)) return true;
    return false;
  }

  static private boolean jj_3_5() {
    if (jj_3R_10()) return true;
    return false;
  }

  static private boolean jj_3_6() {
    if (jj_3R_10()) return true;
    return false;
  }

  static private boolean jj_3_4() {
    if (jj_3R_10()) return true;
    return false;
  }

  static private boolean jj_3R_19() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(31)) {
    jj_scanpos = xsp;
    if (jj_scan_token(27)) {
    jj_scanpos = xsp;
    if (jj_scan_token(29)) {
    jj_scanpos = xsp;
    if (jj_scan_token(30)) {
    jj_scanpos = xsp;
    if (jj_scan_token(28)) {
    jj_scanpos = xsp;
    if (jj_3R_23()) {
    jj_scanpos = xsp;
    if (jj_3R_24()) {
    jj_scanpos = xsp;
    if (jj_3R_25()) return true;
    }
    }
    }
    }
    }
    }
    }
    return false;
  }

  static private boolean jj_3_3() {
    if (jj_3R_10()) return true;
    return false;
  }

  static private boolean jj_3R_22() {
    if (jj_scan_token(LBRACKET)) return true;
    return false;
  }

  static private boolean jj_3R_20() {
    if (jj_scan_token(LENGTH)) return true;
    return false;
  }

  static private boolean jj_3R_17() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_20()) {
    jj_scanpos = xsp;
    if (jj_3R_21()) return true;
    }
    return false;
  }

  static private boolean jj_3R_18() {
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_22()) jj_scanpos = xsp;
    return false;
  }

  static private boolean jj_3R_21() {
    if (jj_scan_token(30)) return true;
    return false;
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public eg1TokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private Token jj_scanpos, jj_lastpos;
  static private int jj_la;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[20];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x1000,0x1001,0x1000000,0x4000a000,0x4000,0x0,0x4000a000,0x40a20000,0x4000a000,0x0,0x40a20000,0x40a20000,0x0,0x0,0x0,0x0,0xf8000800,0x42000000,0xf8000800,0x40002000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x0,0x0,0x0,0x0,0x1,0x0,0x4,0x0,0x400,0x4,0x4,0x408,0xaa2,0x2ea2,0x1,0x4040,0x0,0x4040,0x0,};
   }
  static final private JJCalls[] jj_2_rtns = new JJCalls[6];
  static private boolean jj_rescan = false;
  static private int jj_gc = 0;

  /** Constructor with InputStream. */
  public eg1(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public eg1(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new eg1TokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public eg1(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new eg1TokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public eg1(eg1TokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(eg1TokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  static final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  static private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;
  static private int[] jj_lasttokens = new int[100];
  static private int jj_endpos;

  static private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[48];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 20; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 48; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

  static private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 6; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
            case 4: jj_3_5(); break;
            case 5: jj_3_6(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  static private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
