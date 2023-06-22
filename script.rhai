let project = new_java_project();

let req_1 = new_docs_grader()
    .project(project)
    .files(["GenericsPractice.Matrix"])
    .out_of(5.0)
    .req_name("Matrix JavaDoc")
    .penalty(1.0)
    .run();

let req_2 = new_by_unit_test_grader()
    .project(project)
    .test_files(["GenericsPractice.MatrixTest"])
    .expected_tests([])
    .out_of(20.0)
    .req_name("Matrix unit tests")
    .run();

let reqs = [req_1, req_2];

show_results(reqs);
generate_feedback(reqs);