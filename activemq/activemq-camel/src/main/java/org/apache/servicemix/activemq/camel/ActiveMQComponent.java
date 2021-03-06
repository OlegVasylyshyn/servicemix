/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.servicemix.activemq.camel;

import javax.jms.ConnectionFactory;

import org.apache.camel.CamelContext;
import org.apache.camel.component.jms.JmsConfiguration;

/**
 * A Camel component for ServiceMix which uses the
 * {@link org.apache.activemq.ActiveMQConnectionFactory} service for connecting to the correct
 * broker.
 */
public class ActiveMQComponent extends org.apache.activemq.camel.component.ActiveMQComponent {

    public static final String NAME = "activemq";

    public ActiveMQComponent(CamelContext camelContext, ConnectionFactory connectionFactory) {
        super(camelContext);
        setConfiguration(new JmsConfiguration(connectionFactory));
    }

}
