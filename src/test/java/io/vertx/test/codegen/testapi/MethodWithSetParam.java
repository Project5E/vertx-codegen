package io.vertx.test.codegen.testapi;

import io.vertx.core.gen.VertxGen;

import java.util.Set;

/**
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
@VertxGen
public interface MethodWithSetParam {

  void foo(Set<String> list);
}