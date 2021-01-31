package com.tom.athome.crazyit.chapter15.chapter1509;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.*;
import java.util.List;

/**
 * AttributeViewTest
 *
 * @author Tom on 2021/1/23
 */
public class AttributeViewTest {
    public static void main(String[] args) throws IOException {
        Path testPath = Paths.get("AttributeViewTest.java");
        BasicFileAttributeView basicView = Files.getFileAttributeView(testPath, BasicFileAttributeView.class);
        BasicFileAttributes basicAttributes = basicView.readAttributes();
        FileOwnerAttributeView ownerView = Files.getFileAttributeView(testPath, FileOwnerAttributeView.class);
        System.out.println(ownerView.getOwner());
        UserPrincipal user = FileSystems.getDefault().getUserPrincipalLookupService().lookupPrincipalByName("guest");
        ownerView.setOwner(user);
        UserDefinedFileAttributeView userView = Files.getFileAttributeView(testPath, UserDefinedFileAttributeView.class);
        List<String> attrName = userView.list();
        for(String name: attrName){
            ByteBuffer buf = ByteBuffer.allocate(userView.size(name));
            userView.read(name, buf);
            buf.flip();
            String value = Charset.defaultCharset().decode(buf).toString();
            System.out.println(name + "- - ->" + value);
        }
        userView.write("发行者", Charset.defaultCharset().encode("疯狂Java联盟"));
        DosFileAttributeView dosView = Files.getFileAttributeView(testPath,DosFileAttributeView.class);
        dosView.setHidden(true);
        dosView.setReadOnly(true);
    }
}
