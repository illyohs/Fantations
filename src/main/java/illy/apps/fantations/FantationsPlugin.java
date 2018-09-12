package illy.apps.fantations;

import com.sun.source.util.JavacTask;
import com.sun.source.util.Plugin;
import com.sun.tools.javac.api.BasicJavacTask;
import com.sun.tools.javac.processing.JavacProcessingEnvironment;
import com.sun.tools.javac.util.Context;

import javax.annotation.processing.Messager;
import javax.tools.Diagnostic;

public class FantationsPlugin implements Plugin
{
    @Override
    public String getName()
    {
        return "fantations";
    }

    @Override
    public void init(JavacTask task, String... strings)
    {
        task.addTaskListener(new AnnotationsListerner());
    }
}
