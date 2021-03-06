package cn.yuanyu.websocket.config;

import cn.yuanyu.websocket.interceptor.WebSocketInterceptor;
import cn.yuanyu.websocket.websocket.ChatWebSocketHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

/**
 * websocket 配置文件
 */
@Configuration
@EnableWebSocket //
public class WebSocketConfig  implements WebSocketConfigurer {
    //
    @Autowired
    private ChatWebSocketHandler chatWebSocketHandler;
    //
    @Autowired
    private WebSocketInterceptor webSocketInterceptor;

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        /*
         * 添加拦截地址以及相应的websocket消息处理器
         */
        registry.addHandler(chatWebSocketHandler, "/websocket/qrcodelogin")
                .addInterceptors(webSocketInterceptor)
                .setAllowedOrigins("*");
    }


}