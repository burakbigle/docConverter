package org.biglelegal.com;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.commons.codec.binary.Base64;

/**
 * Initialized to create a document converter HTML-PDF-DOCX!
 *
 */
public class Base64Constructer {

    /*
     * If isChunked parameter is set to true, there is a hard wrap of the output
     * encoded text.
     */

    private static final boolean IS_CHUNKED = true;

    /**
     * This method converts the content of a source file into Base64 encoded data
     * and saves that to a target file.
     */
    private static void encodeToBase64(String sourceFile, String targetFile, boolean isChunked) throws Exception {

        byte[] base64EncodedData = Base64.encodeBase64(loadFileAsBytesArray(sourceFile), isChunked);

        writeByteArraysToFile(targetFile, base64EncodedData);F
    }

    public static void decodeToDesiredOutput(String sourceFile, String targetFile) throws Exception {
        // File is corrupted error will be checked tomorrow.
        byte[] decodedBytes = Base64.decodeBase64(loadFileAsBytesArray(sourceFile));

        writeByteArraysToFile(targetFile, decodedBytes);
    }

    /**
     * This method loads a file from file system and returns the byte array of the
     * content.
     */

    private static byte[] loadFileAsBytesArray(String fileName) throws Exception {

        File file = new File(fileName);
        int length = (int) file.length();
        BufferedInputStream reader = new BufferedInputStream(new FileInputStream(file));
        byte[] bytes = new byte[length];
        reader.read(bytes, 0, length);
        reader.close();
        return bytes;

    }

    /**
     * This method writes byte array content into a file.
     */
    private static void writeByteArraysToFile(String fileName, byte[] content) throws IOException {

        File inputFile = new File(fileName);
        BufferedOutputStream byteArrrayWriter = new BufferedOutputStream(new FileOutputStream(inputFile));
        byteArrrayWriter.write(content);
        byteArrrayWriter.flush();
        byteArrrayWriter.close();

    }
}
