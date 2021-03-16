/**
 * generated by Xtext 2.25.0
 */
package pazmysaz.pyke;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Widget</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see pazmysaz.pyke.PykePackage#getWidget()
 * @model
 * @generated
 */
public enum Widget implements Enumerator
{
  /**
   * The '<em><b>Reportcard</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REPORTCARD_VALUE
   * @generated
   * @ordered
   */
  REPORTCARD(0, "reportcard", "reportcard"),

  /**
   * The '<em><b>Eventiles</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EVENTILES_VALUE
   * @generated
   * @ordered
   */
  EVENTILES(1, "eventiles", "eventiles"),

  /**
   * The '<em><b>Pie</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PIE_VALUE
   * @generated
   * @ordered
   */
  PIE(2, "pie", "pie"),

  /**
   * The '<em><b>Histogram</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HISTOGRAM_VALUE
   * @generated
   * @ordered
   */
  HISTOGRAM(3, "histogram", "histogram"),

  /**
   * The '<em><b>Dbar</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DBAR_VALUE
   * @generated
   * @ordered
   */
  DBAR(4, "dbar", "dbar"),

  /**
   * The '<em><b>Badge</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BADGE_VALUE
   * @generated
   * @ordered
   */
  BADGE(5, "badge", "badge"),

  /**
   * The '<em><b>Grid</b></em>' literal object.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GRID_VALUE
   * @generated
   * @ordered
   */
  GRID(6, "grid", "grid");

  /**
   * The '<em><b>Reportcard</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #REPORTCARD
   * @model name="reportcard"
   * @generated
   * @ordered
   */
  public static final int REPORTCARD_VALUE = 0;

  /**
   * The '<em><b>Eventiles</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #EVENTILES
   * @model name="eventiles"
   * @generated
   * @ordered
   */
  public static final int EVENTILES_VALUE = 1;

  /**
   * The '<em><b>Pie</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #PIE
   * @model name="pie"
   * @generated
   * @ordered
   */
  public static final int PIE_VALUE = 2;

  /**
   * The '<em><b>Histogram</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #HISTOGRAM
   * @model name="histogram"
   * @generated
   * @ordered
   */
  public static final int HISTOGRAM_VALUE = 3;

  /**
   * The '<em><b>Dbar</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #DBAR
   * @model name="dbar"
   * @generated
   * @ordered
   */
  public static final int DBAR_VALUE = 4;

  /**
   * The '<em><b>Badge</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #BADGE
   * @model name="badge"
   * @generated
   * @ordered
   */
  public static final int BADGE_VALUE = 5;

  /**
   * The '<em><b>Grid</b></em>' literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #GRID
   * @model name="grid"
   * @generated
   * @ordered
   */
  public static final int GRID_VALUE = 6;

  /**
   * An array of all the '<em><b>Widget</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static final Widget[] VALUES_ARRAY =
    new Widget[]
    {
      REPORTCARD,
      EVENTILES,
      PIE,
      HISTOGRAM,
      DBAR,
      BADGE,
      GRID,
    };

  /**
   * A public read-only list of all the '<em><b>Widget</b></em>' enumerators.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final List<Widget> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

  /**
   * Returns the '<em><b>Widget</b></em>' literal with the specified literal value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param literal the literal.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Widget get(String literal)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Widget result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Widget</b></em>' literal with the specified name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param name the name.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Widget getByName(String name)
  {
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      Widget result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
        return result;
      }
    }
    return null;
  }

  /**
   * Returns the '<em><b>Widget</b></em>' literal with the specified integer value.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the integer value.
   * @return the matching enumerator or <code>null</code>.
   * @generated
   */
  public static Widget get(int value)
  {
    switch (value)
    {
      case REPORTCARD_VALUE: return REPORTCARD;
      case EVENTILES_VALUE: return EVENTILES;
      case PIE_VALUE: return PIE;
      case HISTOGRAM_VALUE: return HISTOGRAM;
      case DBAR_VALUE: return DBAR;
      case BADGE_VALUE: return BADGE;
      case GRID_VALUE: return GRID;
    }
    return null;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final int value;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private final String literal;

  /**
   * Only this class can construct instances.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private Widget(int value, String name, String literal)
  {
    this.value = value;
    this.name = name;
    this.literal = literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getValue()
  {
    return value;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getLiteral()
  {
    return literal;
  }

  /**
   * Returns the literal value of the enumerator, which is its string representation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    return literal;
  }
  
} //Widget
