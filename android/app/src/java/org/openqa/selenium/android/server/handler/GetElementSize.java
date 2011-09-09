/*
Copyright 2010 WebDriver committers
Copyright 2010 Google Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.openqa.selenium.android.server.handler;

import com.google.common.collect.Maps;

import android.graphics.Point;

import org.openqa.selenium.android.AndroidWebElement;
import org.openqa.selenium.remote.SessionId;
import org.openqa.selenium.remote.server.Session;
import org.openqa.selenium.remote.server.rest.ResultType;

import java.util.Map;

public class GetElementSize extends AndroidWebElementHandler {

  public GetElementSize(Session session) {
    super(session);
  }

  public ResultType call() throws Exception {
    AndroidWebElement element = (AndroidWebElement) getElement();
    response.setValue(element.getSize());
    return ResultType.SUCCESS;
  }

  @Override
  public String toString() {
    return String.format("[get element size: %s]", getElementAsString());
  }
}