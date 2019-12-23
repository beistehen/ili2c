package ch.interlis.ili2c.Interlis23.translation;

import static org.junit.Assert.*;

import org.junit.Test;

import ch.ehi.basics.logging.EhiLogger;
import ch.interlis.ili2c.Ili2c;
import ch.interlis.ili2c.Ili2cFailure;
import ch.interlis.ili2c.LogCollector;
import ch.interlis.ili2c.config.Configuration;
import ch.interlis.ili2c.config.FileEntry;
import ch.interlis.ili2c.config.FileEntryKind;
import ch.interlis.ili2c.metamodel.AttributeDef;
import ch.interlis.ili2c.metamodel.EnumerationType;
import ch.interlis.ili2c.metamodel.Model;
import ch.interlis.ili2c.metamodel.Table;
import ch.interlis.ili2c.metamodel.Topic;
import ch.interlis.ili2c.metamodel.TransferDescription;

public class Assoc23Test {
    @Test
    public void assocComplete() throws Exception {
        LogCollector errs=new LogCollector();
        EhiLogger.getInstance().addListener(errs);
        Configuration ili2cConfig=new Configuration();
        FileEntry fileEntry=new FileEntry("test/data/ili23/translation/assocComplete.ili", FileEntryKind.ILIMODELFILE);
        ili2cConfig.addFileEntry(fileEntry);
        TransferDescription td=null;
        try{
            td=ch.interlis.ili2c.Ili2c.runCompiler(ili2cConfig);
        }catch(Ili2cFailure ex){
            
        }
        assertNotNull(td);
        assertEquals(0,errs.getErrs().size());
    }
    @Test
    public void assocOidFail() throws Exception {
        LogCollector errs=new LogCollector();
        EhiLogger.getInstance().addListener(errs);
        Configuration ili2cConfig=new Configuration();
        FileEntry fileEntry=new FileEntry("test/data/ili23/translation/assocOidFail.ili", FileEntryKind.ILIMODELFILE);
        ili2cConfig.addFileEntry(fileEntry);
        TransferDescription td=null;
        try{
            td=ch.interlis.ili2c.Ili2c.runCompiler(ili2cConfig);
        }catch(Ili2cFailure ex){
            
        }
        assertNull(td);
        assertEquals(1,errs.getErrs().size());
    }
    @Test
    public void assocCardinalityFail() throws Exception {
        LogCollector errs=new LogCollector();
        EhiLogger.getInstance().addListener(errs);
        Configuration ili2cConfig=new Configuration();
        FileEntry fileEntry=new FileEntry("test/data/ili23/translation/assocCardinalityFail.ili", FileEntryKind.ILIMODELFILE);
        ili2cConfig.addFileEntry(fileEntry);
        TransferDescription td=null;
        try{
            td=ch.interlis.ili2c.Ili2c.runCompiler(ili2cConfig);
        }catch(Ili2cFailure ex){
            
        }
        assertNull(td);
        assertEquals(1,errs.getErrs().size());
    }
    @Test
    public void assocDerivedFail() throws Exception {
        LogCollector errs=new LogCollector();
        EhiLogger.getInstance().addListener(errs);
        Configuration ili2cConfig=new Configuration();
        FileEntry fileEntry=new FileEntry("test/data/ili23/translation/assocDerivedFail.ili", FileEntryKind.ILIMODELFILE);
        ili2cConfig.addFileEntry(fileEntry);
        TransferDescription td=null;
        try{
            td=ch.interlis.ili2c.Ili2c.runCompiler(ili2cConfig);
        }catch(Ili2cFailure ex){
            
        }
        assertNull(td);
        assertEquals(1,errs.getErrs().size());
    }
}
