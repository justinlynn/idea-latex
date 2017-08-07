/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2016 hsz Jakub Chrzanowski <jakub@hsz.mobi>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package mobi.hsz.idea.latex.highlighter;

import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;

/**
 * Contains highlighter attributes definitions.
 *
 * @author Jakub Chrzanowski <jakub@hsz.mobi>
 * @since 0.1
 */
class LatexHighlighterColors {

    /** Default style for regular comment started with # */
    public static final TextAttributesKey COMMENT = TextAttributesKey.createTextAttributesKey("LATEX.COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);

    /** Default style for Latex instruction started with \ */
    static final TextAttributesKey INSTRUCTION = TextAttributesKey.createTextAttributesKey("LATEX.INSTRUCTION", DefaultLanguageHighlighterColors.FUNCTION_CALL);

    /** Default style for bracket: [](){} */
    static final TextAttributesKey BRACKET = TextAttributesKey.createTextAttributesKey("LATEX.BRACKET", DefaultLanguageHighlighterColors.BRACKETS);

    /** Default style for Latex instruction's argument */
    static final TextAttributesKey ARGUMENT = TextAttributesKey.createTextAttributesKey("LATEX.ARGUMENT", DefaultLanguageHighlighterColors.PARAMETER);

}
