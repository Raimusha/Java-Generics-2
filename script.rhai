let project = new_java_project();


let req_1 = new_docs_grader()
    .project(project)
    .files(["GenericsPractice.Pair"])
    .out_of(5.0)
    .req_name("Pair JavaDoc")
    .penalty(1.0)
    .run();

let req_2 = new_by_unit_test_grader()
    .project(project)
    .test_files(["GenericsPractice.PairTest"])
    .expected_tests([])
    .out_of(20.0)
    .req_name("Pair unit tests")
    .run();

let reqs = [req_1, req_2];

show_results(reqs);
generate_feedback(reqs);