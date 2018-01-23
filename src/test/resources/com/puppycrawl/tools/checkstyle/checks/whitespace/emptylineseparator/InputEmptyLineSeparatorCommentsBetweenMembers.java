package com.puppycrawl.tools.checkstyle.checks.whitespace.emptylineseparator;

public class InputEmptyLineSeparatorCommentsBetweenMembers {

    public static final void method1() { }



    // Method 2 must fail
    public static final void method2() { }



    // Method 3 must fail
    public static final void method3() { }



    /**
     * Method 4 must fail
     */
    public static final void method4() { }

    /*
     * Allow comments to have empty lines before and after.
     */

    public static final void method5() { }

    /**
     * Should not fail because space before
     */
    public static final void method6() { }
    /**
     * Should not fail because there is only one space between
     * method6 and method7
     */

    public static final void method7() { }

    public static final void method8() { } /**
     * Should fail because there is no space
     * between method8 and method9
     */
    public static final void method9() { }

    private static final String STRING = "Comment doesn't start inside string literal:  \"/*\"";
    public static final void method10() { } // Should fail because there is no space between STRING and method10.
}
