package apiapi.gameback.service;

import apiapi.gameback.domain.Document;
import apiapi.gameback.repository.DocumentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DocumentServiceImpl implements DocumentService {

    private final DocumentRepository documentRepository;

    @Override
    public void DocumentSave () {
        Document document = Document.builder().title("test").content("testtest").build();
        documentRepository.save(document);
    }

    @Override
    public Document DocumentGet() {
        return documentRepository.findById(1L).orElse(null);
    }
}
