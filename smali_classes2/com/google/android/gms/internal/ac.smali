.class public Lcom/google/android/gms/internal/ac;
.super Lcom/google/android/gms/internal/abd;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/abd",
        "<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/adf$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/adf$b",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/lang/String;Lcom/google/android/gms/internal/adf$b;Lcom/google/android/gms/internal/adf$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/adf$b",
            "<",
            "Ljava/lang/String;",
            ">;",
            "Lcom/google/android/gms/internal/adf$a;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p4}, Lcom/google/android/gms/internal/abd;-><init>(ILjava/lang/String;Lcom/google/android/gms/internal/adf$a;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/ac;->a:Lcom/google/android/gms/internal/adf$b;

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/internal/zb;)Lcom/google/android/gms/internal/adf;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zb;",
            ")",
            "Lcom/google/android/gms/internal/adf",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    :try_start_0
    new-instance v0, Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/gms/internal/zb;->b:[B

    iget-object v2, p1, Lcom/google/android/gms/internal/zb;->c:Ljava/util/Map;

    invoke-static {v2}, Lcom/google/android/gms/internal/aol;->a(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    invoke-static {p1}, Lcom/google/android/gms/internal/aol;->a(Lcom/google/android/gms/internal/zb;)Lcom/google/android/gms/internal/ru$a;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/adf;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ru$a;)Lcom/google/android/gms/internal/adf;

    move-result-object v0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v0, Ljava/lang/String;

    iget-object v1, p1, Lcom/google/android/gms/internal/zb;->b:[B

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V

    goto :goto_0
.end method

.method protected synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/ac;->a(Ljava/lang/String;)V

    return-void
.end method

.method protected a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ac;->a:Lcom/google/android/gms/internal/adf$b;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/adf$b;->a(Ljava/lang/Object;)V

    return-void
.end method
