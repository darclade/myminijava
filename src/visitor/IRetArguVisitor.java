/* Generated by JTB 1.4.4 */
package visitor;

import syntaxtree.*;

public interface IRetArguVisitor<R, A> {

  public R visit(final NodeList n, final A argu);

  public R visit(final NodeListOptional n, final A argu);

  public R visit(final NodeOptional n, final A argu);

  public R visit(final NodeSequence n, final A argu);

  public R visit(final NodeToken n, final A argu);

  public R visit(final Go n, final A argu);

  public R visit(final MainClass n, final A argu);

  public R visit(final ClassDeclaration n, final A argu);

  public R visit(final VarDeclaration n, final A argu);

  public R visit(final MethodDeclaration n, final A argu);

  public R visit(final Type n, final A argu);

  public R visit(final TypeLine n, final A argu);

  public R visit(final Statement n, final A argu);

  public R visit(final StatementLine n, final A argu);

  public R visit(final Expression n, final A argu);

  public R visit(final ExpressionLine n, final A argu);

  public R visit(final ExpressionLineTwo n, final A argu);

  public R visit(final AExpression n, final A argu);

  public R visit(final NewLine n, final A argu);

  public R visit(final Identifier n, final A argu);

}
