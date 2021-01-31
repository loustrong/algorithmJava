package com.tom.athome.crazyit.chapter15.chapter1509;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/**
 * CharsetTransform
 *
 * @author Tom on 2021/1/23
 */
public class CharsetTransform {
    public static void main(String[] args) throws CharacterCodingException {
        Charset cn = Charset.forName("GBK");
        CharsetEncoder cnEncoder = cn.newEncoder();
        CharsetDecoder cnDecoder = cn.newDecoder();
        CharBuffer cbuffer = CharBuffer.allocate(8);
        cbuffer.put('孙');
        cbuffer.put('悟');
        cbuffer.put('空');
        cbuffer.flip();
        ByteBuffer bbuff  = cnEncoder.encode(cbuffer);
        for (int i = 0; i < bbuff.capacity(); i++) {
            System.out.println(bbuff.get(i) + " ");
        }
        System.out.println("\n" + cnDecoder.decode(bbuff));

    }
}
