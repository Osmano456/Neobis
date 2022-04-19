FROM mysql:latest

ENV MYSQL_ROOT_PASSWORD=Osman456
ENV MYSQL_DATABASE=cafe

COPY cafewdata.sql /docker-entrypoint-initdb.d/

ENTRYPOINT ["docker-entrypoint.sh"]
CMD ["mysqld"]