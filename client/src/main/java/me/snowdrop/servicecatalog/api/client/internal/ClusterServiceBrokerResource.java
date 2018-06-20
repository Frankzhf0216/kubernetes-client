/*
 * Copyright (C) 2018 Red Hat inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.snowdrop.servicecatalog.api.client.internal;

import io.fabric8.kubernetes.client.dsl.Resource;
import me.snowdrop.servicecatalog.api.model.ClusterServiceBroker;
import me.snowdrop.servicecatalog.api.model.ClusterServiceClassList;
import me.snowdrop.servicecatalog.api.model.ClusterServicePlanList;
import me.snowdrop.servicecatalog.api.model.DoneableClusterServiceBroker;

public interface ClusterServiceBrokerResource extends Resource<ClusterServiceBroker, DoneableClusterServiceBroker> {


    /**
     * List all {@link me.snowdrop.servicecatalog.api.model.ClusterServicePlan}s available to the current broker.
     * It's an alternative of listing all plans and filtering by field.
     * @return The list of plans.
     */
    ClusterServicePlanList listPlans();

    /**
     * List all {@link me.snowdrop.servicecatalog.api.model.ClusterServiceClass}es available to the current broker.
     * It's an alternative of listing all classes and filtering by field.
     * @return The list of plans.
     */
    ClusterServiceClassList listClasses();
}
