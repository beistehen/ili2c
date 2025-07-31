package ch.interlis.ili2c.generator.nls;

import java.util.Comparator;

public class NlsModelElement {
	private String scopedName;
	private String elementType;
	private java.util.Map<String,String> name=new java.util.HashMap<String,String>();
	private java.util.Map<String,String> documentation=new java.util.HashMap<String,String>();
    private java.util.Map<String,String> metaAttr=new java.util.HashMap<String,String>();
    public java.util.List<String> getLanguages(){
        java.util.Set<String> langs=new java.util.HashSet<String>();
        langs.addAll(name.keySet());
        langs.addAll(documentation.keySet());
        java.util.List<String> ret=new java.util.ArrayList<String>(langs);
        java.util.Collections.sort(ret,new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1==o2) {
                    return 0;
                }
                if(o1==null) {
                    return -1;
                }
                if(o2==null) {
                    return 1;
                }
                return o1.compareTo(o2);
            }
            
        });
        return ret;
    }
    public String getScopedName() {
        return scopedName;
    }
    public void setScopedName(String scopedName) {
        if(scopedName==null) {
            throw new IllegalArgumentException();
        }
        this.scopedName = scopedName;
    }
    public String getElementType() {
        return elementType;
    }
    public void setElementType(String elementType) {
        if(elementType==null) {
            throw new IllegalArgumentException();
        }
        this.elementType = elementType;
    }
    public String getName(String lang) {
        return name.get(lang);
    }
    public void setName(String lang,String name) {
        this.name.put(lang,name);
    }
    public String getDocumentation(String lang) {
        return documentation.get(lang);
    }
    public void setDocumentation(String lang,String documentation) {
        this.documentation.put(lang,documentation);
    }
    public java.util.List<String> getMetaAttrs(){
        java.util.Set<String> metaAttrs=new java.util.HashSet<String>();
        metaAttrs.addAll(metaAttr.keySet());
        java.util.List<String> ret=new java.util.ArrayList<String>(metaAttrs);
        java.util.Collections.sort(ret);
        return ret;
    }
    public String getMetaAttr(String attrName) {
        return metaAttr.get(attrName);
    }
    public void setMetaAttr(String attrName,String attrValue) {
        if(attrName==null) {
            throw new IllegalArgumentException();
        }
        this.metaAttr.put(attrName,attrValue);
    }
}
