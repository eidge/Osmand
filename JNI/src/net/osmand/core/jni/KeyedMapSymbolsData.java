/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.3
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package net.osmand.core.jni;

public class KeyedMapSymbolsData extends MapKeyedData {
  private long swigCPtr;
  private boolean swigCMemOwnDerived;

  protected KeyedMapSymbolsData(long cPtr, boolean cMemoryOwn) {
    super(OsmAndCoreJNI.KeyedMapSymbolsData_SWIGSmartPtrUpcast(cPtr), true);
    swigCMemOwnDerived = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(KeyedMapSymbolsData obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwnDerived) {
        swigCMemOwnDerived = false;
        OsmAndCoreJNI.delete_KeyedMapSymbolsData(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public KeyedMapSymbolsData(MapSymbolsGroup symbolsGroup, SWIGTYPE_p_void key) {
    this(OsmAndCoreJNI.new_KeyedMapSymbolsData(MapSymbolsGroup.getCPtr(symbolsGroup), symbolsGroup, SWIGTYPE_p_void.getCPtr(key)), true);
  }

  public void setSymbolsGroup(MapSymbolsGroup value) {
    OsmAndCoreJNI.KeyedMapSymbolsData_symbolsGroup_set(swigCPtr, this, MapSymbolsGroup.getCPtr(value), value);
  }

  public MapSymbolsGroup getSymbolsGroup() {
    long cPtr = OsmAndCoreJNI.KeyedMapSymbolsData_symbolsGroup_get(swigCPtr, this);
    return (cPtr == 0) ? null : new MapSymbolsGroup(cPtr, true);
  }

  public void releaseConsumableContent() {
    OsmAndCoreJNI.KeyedMapSymbolsData_releaseConsumableContent(swigCPtr, this);
  }

}