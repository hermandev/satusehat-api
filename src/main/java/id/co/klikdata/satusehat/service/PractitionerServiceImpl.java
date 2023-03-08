package id.co.klikdata.satusehat.service;

import org.springframework.stereotype.Service;

import id.co.klikdata.satusehat.dto.PractitionerResponse;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PractitionerServiceImpl implements PractitionerService {
    private final SatuSehatService satuSehatService;

    @Override
    public PractitionerResponse getDokterByNik(String nik) {
        return satuSehatService.getDokterByNik(nik);
    }

}
