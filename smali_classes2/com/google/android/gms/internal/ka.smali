.class public Lcom/google/android/gms/internal/ka;
.super Ljava/lang/Object;


# instance fields
.field private final a:Lcom/google/android/gms/internal/kc$a;

.field private final b:Lcom/google/android/gms/internal/lc;

.field private final c:Lcom/google/android/gms/internal/lc;

.field private final d:Lcom/google/android/gms/internal/kv;

.field private final e:Lcom/google/android/gms/internal/kv;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/kc$a;Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ka;->a:Lcom/google/android/gms/internal/kc$a;

    iput-object p2, p0, Lcom/google/android/gms/internal/ka;->b:Lcom/google/android/gms/internal/lc;

    iput-object p3, p0, Lcom/google/android/gms/internal/ka;->d:Lcom/google/android/gms/internal/kv;

    iput-object p4, p0, Lcom/google/android/gms/internal/ka;->e:Lcom/google/android/gms/internal/kv;

    iput-object p5, p0, Lcom/google/android/gms/internal/ka;->c:Lcom/google/android/gms/internal/lc;

    return-void
.end method

.method public static a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lc;)Lcom/google/android/gms/internal/ka;
    .locals 6

    const/4 v4, 0x0

    new-instance v0, Lcom/google/android/gms/internal/ka;

    sget-object v1, Lcom/google/android/gms/internal/kc$a;->b:Lcom/google/android/gms/internal/kc$a;

    move-object v2, p1

    move-object v3, p0

    move-object v5, v4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ka;-><init>(Lcom/google/android/gms/internal/kc$a;Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lc;)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/lc;)Lcom/google/android/gms/internal/ka;
    .locals 6

    new-instance v0, Lcom/google/android/gms/internal/ka;

    sget-object v1, Lcom/google/android/gms/internal/kc$a;->d:Lcom/google/android/gms/internal/kc$a;

    const/4 v4, 0x0

    move-object v2, p1

    move-object v3, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ka;-><init>(Lcom/google/android/gms/internal/kc$a;Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lc;)V

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/ka;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lc;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ka;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lc;)Lcom/google/android/gms/internal/ka;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/ka;
    .locals 2

    invoke-static {p1}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lc;

    move-result-object v0

    invoke-static {p2}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lc;

    move-result-object v1

    invoke-static {p0, v0, v1}, Lcom/google/android/gms/internal/ka;->a(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/lc;)Lcom/google/android/gms/internal/ka;

    move-result-object v0

    return-object v0
.end method

.method public static a(Lcom/google/android/gms/internal/lc;)Lcom/google/android/gms/internal/ka;
    .locals 6

    const/4 v3, 0x0

    new-instance v0, Lcom/google/android/gms/internal/ka;

    sget-object v1, Lcom/google/android/gms/internal/kc$a;->e:Lcom/google/android/gms/internal/kc$a;

    move-object v2, p0

    move-object v4, v3

    move-object v5, v3

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ka;-><init>(Lcom/google/android/gms/internal/kc$a;Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lc;)V

    return-object v0
.end method

.method public static b(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lc;)Lcom/google/android/gms/internal/ka;
    .locals 6

    const/4 v4, 0x0

    new-instance v0, Lcom/google/android/gms/internal/ka;

    sget-object v1, Lcom/google/android/gms/internal/kc$a;->a:Lcom/google/android/gms/internal/kc$a;

    move-object v2, p1

    move-object v3, p0

    move-object v5, v4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ka;-><init>(Lcom/google/android/gms/internal/kc$a;Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lc;)V

    return-object v0
.end method

.method public static b(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/ka;
    .locals 1

    invoke-static {p1}, Lcom/google/android/gms/internal/lc;->a(Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lc;

    move-result-object v0

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/ka;->b(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lc;)Lcom/google/android/gms/internal/ka;

    move-result-object v0

    return-object v0
.end method

.method public static c(Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lc;)Lcom/google/android/gms/internal/ka;
    .locals 6

    const/4 v4, 0x0

    new-instance v0, Lcom/google/android/gms/internal/ka;

    sget-object v1, Lcom/google/android/gms/internal/kc$a;->c:Lcom/google/android/gms/internal/kc$a;

    move-object v2, p1

    move-object v3, p0

    move-object v5, v4

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ka;-><init>(Lcom/google/android/gms/internal/kc$a;Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lc;)V

    return-object v0
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/kv;)Lcom/google/android/gms/internal/ka;
    .locals 6

    new-instance v0, Lcom/google/android/gms/internal/ka;

    iget-object v1, p0, Lcom/google/android/gms/internal/ka;->a:Lcom/google/android/gms/internal/kc$a;

    iget-object v2, p0, Lcom/google/android/gms/internal/ka;->b:Lcom/google/android/gms/internal/lc;

    iget-object v3, p0, Lcom/google/android/gms/internal/ka;->d:Lcom/google/android/gms/internal/kv;

    iget-object v5, p0, Lcom/google/android/gms/internal/ka;->c:Lcom/google/android/gms/internal/lc;

    move-object v4, p1

    invoke-direct/range {v0 .. v5}, Lcom/google/android/gms/internal/ka;-><init>(Lcom/google/android/gms/internal/kc$a;Lcom/google/android/gms/internal/lc;Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/kv;Lcom/google/android/gms/internal/lc;)V

    return-object v0
.end method

.method public a()Lcom/google/android/gms/internal/kv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ka;->d:Lcom/google/android/gms/internal/kv;

    return-object v0
.end method

.method public b()Lcom/google/android/gms/internal/kc$a;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ka;->a:Lcom/google/android/gms/internal/kc$a;

    return-object v0
.end method

.method public c()Lcom/google/android/gms/internal/lc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ka;->b:Lcom/google/android/gms/internal/lc;

    return-object v0
.end method

.method public d()Lcom/google/android/gms/internal/kv;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ka;->e:Lcom/google/android/gms/internal/kv;

    return-object v0
.end method

.method public e()Lcom/google/android/gms/internal/lc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ka;->c:Lcom/google/android/gms/internal/lc;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/ka;->a:Lcom/google/android/gms/internal/kc$a;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/ka;->d:Lcom/google/android/gms/internal/kv;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    add-int/lit8 v3, v3, 0x9

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    add-int/2addr v3, v4

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v3, "Change: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
