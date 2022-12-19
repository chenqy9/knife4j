/*
 * Copyright 2017-2022 八一菜刀(xiaoymin@foxmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.github.xiaoymin.knife4j.aggre.core;

/***
 *
 * @since:knife4j-aggregation-spring-boot-starter 2.0.8
 * @author <a href="mailto:xiaoymin@foxmail.com">xiaoymin@foxmail.com</a> 
 * 2020/10/29 20:33
 */
public interface RouteExecutor {
    
    /**
     * 执行器
     * @param routeContext 请求上下文
     * @return 响应对象
     */
    RouteResponse executor(RouteRequestContext routeContext);
}
