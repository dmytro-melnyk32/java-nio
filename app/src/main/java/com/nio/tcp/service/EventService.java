package com.nio.tcp.service;

import java.io.IOException;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public interface EventService {

  void acceptEvent(ServerSocketChannel channel) throws IOException;

  void readEvent(SocketChannel channel, int writingPort, int readingPort) throws IOException;
}
