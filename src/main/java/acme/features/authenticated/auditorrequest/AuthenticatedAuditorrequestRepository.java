
package acme.features.authenticated.auditorrequest;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import acme.entities.auditorrequest.Auditorrequest;
import acme.framework.repositories.AbstractRepository;

@Repository
public interface AuthenticatedAuditorrequestRepository extends AbstractRepository {

	@Query("select a from Auditorrequest a where a.id = ?1")
	Auditorrequest findOneById(int id);

}