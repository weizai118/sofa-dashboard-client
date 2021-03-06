/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alipay.sofa.dashboard.client.common;

import com.alipay.sofa.dashboard.client.model.Application;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author: guolei.sgl (guolei.sgl@antfin.com) 2019/4/10 11:00 AM
 * @since:
 **/
public class ObjectBytesUtilsTest {

    @Test
    public void testObjectBytesUtil() {
        Application self = new Application();
        self.setAppName("test");
        byte[] bytes = ObjectBytesUtils.convertFromObject(self);
        Assert.assertNotNull(bytes);
        Application application = ObjectBytesUtils.convertFromBytes(bytes, Application.class);
        Assert.assertEquals("test", application.getAppName());
    }

    @Test
    public void testObjectBytesUtil_null() {
        byte[] bytes = ObjectBytesUtils.convertFromObject(null);
        Assert.assertNull(bytes);
        Application application = ObjectBytesUtils.convertFromBytes(bytes, Application.class);
        Assert.assertNull(application);
    }
}
