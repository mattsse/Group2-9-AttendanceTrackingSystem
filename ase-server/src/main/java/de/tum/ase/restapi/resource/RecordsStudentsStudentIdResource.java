package de.tum.ase.restapi.resource;

import de.tum.ase.restapi.representation.AttendanceRecord;
import org.restlet.resource.Get;

import java.util.List;

public interface RecordsStudentsStudentIdResource {

    @Get
    List<AttendanceRecord> represent() throws Exception;

}

