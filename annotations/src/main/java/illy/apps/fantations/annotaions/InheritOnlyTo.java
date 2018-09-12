package illy.apps.fantations.annotaions;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.CLASS)
public @interface InheritOnlyTo
{
    Class<?>[] value();
    boolean packageOverride() default false;
    boolean stringOverride() default  false;
    String namespace() default "";

}
