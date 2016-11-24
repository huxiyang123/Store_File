package com.qf.lesson.callback;

import java.io.InputStream;

/*
 * 当被调用者操作执行完毕，通过send方法通知调用者
 */
public interface Callback {
  void send(InputStream bs);
}
