/*
 * Copyright 2013 bankinterface.org
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
package org.bankinterface.service;

import org.bankinterface.param.Notification;
import org.bankinterface.param.RefundParam;
import org.bankinterface.result.RefundResult;

/**
 * 退款接口,提供退款功能
 * 
 */
public interface Refund {

    /**
     * 调用支付机构退款接口,并返回退款结果.
     * 
     * @param refundParam
     * @return
     */
    RefundResult refund(RefundParam refundParam);

    /**
     * 调用支付机构退款接口,并返回退款结果.
     * 
     * @param refundParam
     * @return
     */
    String refund(String refundParam);

    /**
     * 验证支付机构通知合法性,并进行结果转换.
     * 
     * @param notification
     * @return
     */
    RefundResult resolveRefundResult(Notification notification);

    /**
     * 验证支付机构通知合法性,并进行结果转换.
     * 
     * @param notification
     * @return
     */
    String resolveRefundResult(String notification);
}
