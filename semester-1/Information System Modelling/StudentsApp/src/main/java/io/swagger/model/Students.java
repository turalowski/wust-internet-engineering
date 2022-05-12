package io.swagger.model;

import java.util.Objects;
import io.swagger.model.Student;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;


import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * Students
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2021-03-24T23:01:48.272Z[GMT]")
@XmlRootElement(name = "Students")
@XmlSeeAlso({Student.class}) // needed to get nested nodes in XML as: <Students><Student>..<Student><Students>
public class Students extends ArrayList<Student>  {
	private static final long serialVersionUID = 1L;

@XmlElement(name = "Student") // needed to get nested nodes in XML as: <Students><Student>..<Student><Students>
  public List<Student> getStudents() {
    return this;
  }
	  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Students {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
