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

package mobi.hsz.idea.latex.actions.editor.base;

import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.Toggleable;
import com.intellij.openapi.editor.CaretModel;
import com.intellij.openapi.editor.Document;
import com.intellij.openapi.fileEditor.TextEditor;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

/**
 * @author Jakub Chrzanowski <jakub@hsz.mobi>
 * @since 0.3
 */
public abstract class InsertEditorAction extends EditorAction implements Toggleable {

    /** Builds a new instance of {@link InsertEditorAction}. */
    public InsertEditorAction(@NotNull Type type, @NotNull String name, @NotNull Icon icon) {
        super(type, name, icon);
    }

    @Override
    protected void actionPerformed(@NotNull AnActionEvent event, @NotNull final Project project, @NotNull VirtualFile virtualFile, @NotNull final TextEditor editor) {
        runWriteAction(project, new Runnable() {
            @Override
            public void run() {
                final Document document = editor.getEditor().getDocument();
                final CaretModel caretModel = editor.getEditor().getCaretModel();
                int offset = caretModel.getOffset();
                String text = getText();

                document.insertString(offset, text);
                caretModel.moveToOffset(offset + text.length());
            }
        });
    }

    /**
     * Returns text to insert.
     *
     * @return text to insert
     */
    @NotNull
    protected abstract String getText();

}
