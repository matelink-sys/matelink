package cn.fateverse.common.decrypt.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Clay
 * @date 2023-07-03
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Encrypt {

    Position value() default Position.ALL;


    EncryptType type() default EncryptType.SM4;


    enum EncryptType {

        SM4,

    }

    enum Position {
        ALL,
        OUT,
        IN
    }

}
