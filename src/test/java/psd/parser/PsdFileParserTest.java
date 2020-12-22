/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psd.parser;

import java.io.InputStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import psd.parser.header.HeaderSectionParser;
import psd.parser.imagedata.ImageDataSectionParser;
import psd.parser.imageresource.ImageResourceSectionParser;
import psd.parser.layer.LayersSectionParser;

/**
 *
 * @author kitfox
 */
public class PsdFileParserTest
{
    
    public PsdFileParserTest()
    {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception
    {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception
    {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception
    {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception
    {
    }
    
//    @BeforeAll
//    public static void setUpClass()
//    {
//    }
//    
//    @AfterAll
//    public static void tearDownClass()
//    {
//    }
//    
//    @BeforeEach
//    public void setUp()
//    {
//    }
//    
//    @AfterEach
//    public void tearDown()
//    {
//    }

//    /**
//     * Test of getHeaderSectionParser method, of class PsdFileParser.
//     */
//    @org.junit.jupiter.api.Test
//    public void testGetHeaderSectionParser()
//    {
//        System.out.println("getHeaderSectionParser");
//        PsdFileParser instance = new PsdFileParser();
//        HeaderSectionParser expResult = null;
//        HeaderSectionParser result = instance.getHeaderSectionParser();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getImageResourceSectionParser method, of class PsdFileParser.
//     */
//    @org.junit.jupiter.api.Test
//    public void testGetImageResourceSectionParser()
//    {
//        System.out.println("getImageResourceSectionParser");
//        PsdFileParser instance = new PsdFileParser();
//        ImageResourceSectionParser expResult = null;
//        ImageResourceSectionParser result = instance.getImageResourceSectionParser();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLayersSectionParser method, of class PsdFileParser.
//     */
//    @org.junit.jupiter.api.Test
//    public void testGetLayersSectionParser()
//    {
//        System.out.println("getLayersSectionParser");
//        PsdFileParser instance = new PsdFileParser();
//        LayersSectionParser expResult = null;
//        LayersSectionParser result = instance.getLayersSectionParser();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getImageDataSectionParser method, of class PsdFileParser.
//     */
//    @org.junit.jupiter.api.Test
//    public void testGetImageDataSectionParser()
//    {
//        System.out.println("getImageDataSectionParser");
//        PsdFileParser instance = new PsdFileParser();
//        ImageDataSectionParser expResult = null;
//        ImageDataSectionParser result = instance.getImageDataSectionParser();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of parse method, of class PsdFileParser.
     */
    @org.junit.jupiter.api.Test
    public void testParse() throws Exception
    {
        InputStream inputStream = PsdFileParserTest.class.getResourceAsStream("/blank.psd");
        
        
        System.out.println("parse");
//        InputStream inputStream = null;
        PsdFileParser instance = new PsdFileParser();
        instance.parse(inputStream);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
