/**
 * Copyright &copy; 2017 Dell Inc. or its subsidiaries. All Rights Reserved.
 * VCE Confidential/Proprietary Information
 */

package com.dell.cpsd.hdp.capability.registry.client.amqp.consumer;

import com.dell.cpsd.hdp.capability.registry.api.CapabilityProvider;

/**
 * This interface should be implemented by a consumer of service control messages.
 * <p>
 * <p/>
 * Copyright &copy; 2017 Dell Inc. or its subsidiaries. All Rights Reserved.
 * <p/>
 *
 * @version 1.0
 * 
 * @since SINCE-TBD
 */
public interface IAmqpCapabilityRegistryControlConsumer
{
    /**
     * This returns the reply to destination for the service message queue for
     * this consumer.
     *
     * @return  The reply to destination for the service message queue.
     * 
     * @since   1.0
     */
    public String getReplyTo();
    
    
    /**
     * This sets the capability provider information.
     * 
     * @param   capabilityProvider    The capability provider information.
     * 
     * @since   1.0
     */
    public void setCapabilityProvider(final CapabilityProvider capabilityProvider);
}
