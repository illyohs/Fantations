package illy.apps.fantations;

import com.sun.source.util.TaskEvent;
import com.sun.source.util.TaskListener;
import com.sun.tools.javac.util.Log;

public class AnnotationsListerner implements TaskListener
{
    @Override
    public void started(TaskEvent task)
    {
    }

    @Override
    public void finished(TaskEvent task)
    {
        if (task.getKind() == TaskEvent.Kind.PARSE)
        {
        }

    }
}
