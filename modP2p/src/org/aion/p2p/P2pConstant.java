package org.aion.p2p;

import org.aion.base.Constant;

public class P2pConstant {

    public static final int //

    STOP_CONN_AFTER_FAILED_CONN = 8, //

            FAILED_CONN_RETRY_INTERVAL = 3000, //

            BAN_CONN_RETRY_INTERVAL = 30_000, //

            MAX_BODY_SIZE = Constant.MAX_BLK_SIZE * 32, //

            RECV_BUFFER_SIZE = 8192 * 1024, //

            SEND_BUFFER_SIZE = 8192 * 1024, //

            WRITE_TIME_OUT = 10000;

}
