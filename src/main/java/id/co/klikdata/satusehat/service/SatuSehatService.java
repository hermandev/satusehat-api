package id.co.klikdata.satusehat.service;

import org.springframework.http.ResponseEntity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;

import id.co.klikdata.satusehat.dto.PatientResponse;
import id.co.klikdata.satusehat.dto.PractitionerResponse;

public interface SatuSehatService {
    PatientResponse getPasientByNik(String nik);

    PractitionerResponse getDokterByNik(String nik);

    ResponseEntity<JsonNode> getPasienByNameGenderAndBirthdate(String name, String gender, String birthdate)
            throws JsonMappingException, JsonProcessingException;
}
