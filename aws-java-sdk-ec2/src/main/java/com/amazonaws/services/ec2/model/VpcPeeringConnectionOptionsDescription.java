/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the VPC peering connection options.
 * </p>
 */
public class VpcPeeringConnectionOptionsDescription implements Serializable,
        Cloneable {

    /**
     * <p>
     * Indicates whether a local ClassicLink connection can communicate with the
     * peer VPC over the VPC peering connection.
     * </p>
     */
    private Boolean allowEgressFromLocalClassicLinkToRemoteVpc;
    /**
     * <p>
     * Indicates whether a local VPC can communicate with a ClassicLink
     * connection in the peer VPC over the VPC peering connection.
     * </p>
     */
    private Boolean allowEgressFromLocalVpcToRemoteClassicLink;

    /**
     * <p>
     * Indicates whether a local ClassicLink connection can communicate with the
     * peer VPC over the VPC peering connection.
     * </p>
     * 
     * @param allowEgressFromLocalClassicLinkToRemoteVpc
     *        Indicates whether a local ClassicLink connection can communicate
     *        with the peer VPC over the VPC peering connection.
     */

    public void setAllowEgressFromLocalClassicLinkToRemoteVpc(
            Boolean allowEgressFromLocalClassicLinkToRemoteVpc) {
        this.allowEgressFromLocalClassicLinkToRemoteVpc = allowEgressFromLocalClassicLinkToRemoteVpc;
    }

    /**
     * <p>
     * Indicates whether a local ClassicLink connection can communicate with the
     * peer VPC over the VPC peering connection.
     * </p>
     * 
     * @return Indicates whether a local ClassicLink connection can communicate
     *         with the peer VPC over the VPC peering connection.
     */

    public Boolean getAllowEgressFromLocalClassicLinkToRemoteVpc() {
        return this.allowEgressFromLocalClassicLinkToRemoteVpc;
    }

    /**
     * <p>
     * Indicates whether a local ClassicLink connection can communicate with the
     * peer VPC over the VPC peering connection.
     * </p>
     * 
     * @param allowEgressFromLocalClassicLinkToRemoteVpc
     *        Indicates whether a local ClassicLink connection can communicate
     *        with the peer VPC over the VPC peering connection.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public VpcPeeringConnectionOptionsDescription withAllowEgressFromLocalClassicLinkToRemoteVpc(
            Boolean allowEgressFromLocalClassicLinkToRemoteVpc) {
        setAllowEgressFromLocalClassicLinkToRemoteVpc(allowEgressFromLocalClassicLinkToRemoteVpc);
        return this;
    }

    /**
     * <p>
     * Indicates whether a local ClassicLink connection can communicate with the
     * peer VPC over the VPC peering connection.
     * </p>
     * 
     * @return Indicates whether a local ClassicLink connection can communicate
     *         with the peer VPC over the VPC peering connection.
     */

    public Boolean isAllowEgressFromLocalClassicLinkToRemoteVpc() {
        return this.allowEgressFromLocalClassicLinkToRemoteVpc;
    }

    /**
     * <p>
     * Indicates whether a local VPC can communicate with a ClassicLink
     * connection in the peer VPC over the VPC peering connection.
     * </p>
     * 
     * @param allowEgressFromLocalVpcToRemoteClassicLink
     *        Indicates whether a local VPC can communicate with a ClassicLink
     *        connection in the peer VPC over the VPC peering connection.
     */

    public void setAllowEgressFromLocalVpcToRemoteClassicLink(
            Boolean allowEgressFromLocalVpcToRemoteClassicLink) {
        this.allowEgressFromLocalVpcToRemoteClassicLink = allowEgressFromLocalVpcToRemoteClassicLink;
    }

    /**
     * <p>
     * Indicates whether a local VPC can communicate with a ClassicLink
     * connection in the peer VPC over the VPC peering connection.
     * </p>
     * 
     * @return Indicates whether a local VPC can communicate with a ClassicLink
     *         connection in the peer VPC over the VPC peering connection.
     */

    public Boolean getAllowEgressFromLocalVpcToRemoteClassicLink() {
        return this.allowEgressFromLocalVpcToRemoteClassicLink;
    }

    /**
     * <p>
     * Indicates whether a local VPC can communicate with a ClassicLink
     * connection in the peer VPC over the VPC peering connection.
     * </p>
     * 
     * @param allowEgressFromLocalVpcToRemoteClassicLink
     *        Indicates whether a local VPC can communicate with a ClassicLink
     *        connection in the peer VPC over the VPC peering connection.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */

    public VpcPeeringConnectionOptionsDescription withAllowEgressFromLocalVpcToRemoteClassicLink(
            Boolean allowEgressFromLocalVpcToRemoteClassicLink) {
        setAllowEgressFromLocalVpcToRemoteClassicLink(allowEgressFromLocalVpcToRemoteClassicLink);
        return this;
    }

    /**
     * <p>
     * Indicates whether a local VPC can communicate with a ClassicLink
     * connection in the peer VPC over the VPC peering connection.
     * </p>
     * 
     * @return Indicates whether a local VPC can communicate with a ClassicLink
     *         connection in the peer VPC over the VPC peering connection.
     */

    public Boolean isAllowEgressFromLocalVpcToRemoteClassicLink() {
        return this.allowEgressFromLocalVpcToRemoteClassicLink;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getAllowEgressFromLocalClassicLinkToRemoteVpc() != null)
            sb.append("AllowEgressFromLocalClassicLinkToRemoteVpc: "
                    + getAllowEgressFromLocalClassicLinkToRemoteVpc() + ",");
        if (getAllowEgressFromLocalVpcToRemoteClassicLink() != null)
            sb.append("AllowEgressFromLocalVpcToRemoteClassicLink: "
                    + getAllowEgressFromLocalVpcToRemoteClassicLink());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VpcPeeringConnectionOptionsDescription == false)
            return false;
        VpcPeeringConnectionOptionsDescription other = (VpcPeeringConnectionOptionsDescription) obj;
        if (other.getAllowEgressFromLocalClassicLinkToRemoteVpc() == null
                ^ this.getAllowEgressFromLocalClassicLinkToRemoteVpc() == null)
            return false;
        if (other.getAllowEgressFromLocalClassicLinkToRemoteVpc() != null
                && other.getAllowEgressFromLocalClassicLinkToRemoteVpc()
                        .equals(this
                                .getAllowEgressFromLocalClassicLinkToRemoteVpc()) == false)
            return false;
        if (other.getAllowEgressFromLocalVpcToRemoteClassicLink() == null
                ^ this.getAllowEgressFromLocalVpcToRemoteClassicLink() == null)
            return false;
        if (other.getAllowEgressFromLocalVpcToRemoteClassicLink() != null
                && other.getAllowEgressFromLocalVpcToRemoteClassicLink()
                        .equals(this
                                .getAllowEgressFromLocalVpcToRemoteClassicLink()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getAllowEgressFromLocalClassicLinkToRemoteVpc() == null) ? 0
                        : getAllowEgressFromLocalClassicLinkToRemoteVpc()
                                .hashCode());
        hashCode = prime
                * hashCode
                + ((getAllowEgressFromLocalVpcToRemoteClassicLink() == null) ? 0
                        : getAllowEgressFromLocalVpcToRemoteClassicLink()
                                .hashCode());
        return hashCode;
    }

    @Override
    public VpcPeeringConnectionOptionsDescription clone() {
        try {
            return (VpcPeeringConnectionOptionsDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}
