.class Lcom/google/android/gms/internal/acc$b;
.super Lcom/google/android/gms/internal/abd;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/internal/acc;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/gms/internal/abd",
        "<",
        "Ljava/io/InputStream;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/android/gms/internal/acc$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/acc$a",
            "<TT;>;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/android/gms/internal/adf$b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/android/gms/internal/adf$b",
            "<TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/google/android/gms/internal/acc$a;Lcom/google/android/gms/internal/adf$b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/google/android/gms/internal/acc$a",
            "<TT;>;",
            "Lcom/google/android/gms/internal/adf$b",
            "<TT;>;)V"
        }
    .end annotation

    const/4 v0, 0x0

    new-instance v1, Lcom/google/android/gms/internal/acc$b$1;

    invoke-direct {v1, p3, p2}, Lcom/google/android/gms/internal/acc$b$1;-><init>(Lcom/google/android/gms/internal/adf$b;Lcom/google/android/gms/internal/acc$a;)V

    invoke-direct {p0, v0, p1, v1}, Lcom/google/android/gms/internal/abd;-><init>(ILjava/lang/String;Lcom/google/android/gms/internal/adf$a;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/acc$b;->a:Lcom/google/android/gms/internal/acc$a;

    iput-object p3, p0, Lcom/google/android/gms/internal/acc$b;->b:Lcom/google/android/gms/internal/adf$b;

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/android/gms/internal/zb;)Lcom/google/android/gms/internal/adf;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/zb;",
            ")",
            "Lcom/google/android/gms/internal/adf",
            "<",
            "Ljava/io/InputStream;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/io/ByteArrayInputStream;

    iget-object v1, p1, Lcom/google/android/gms/internal/zb;->b:[B

    invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-static {p1}, Lcom/google/android/gms/internal/aol;->a(Lcom/google/android/gms/internal/zb;)Lcom/google/android/gms/internal/ru$a;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/adf;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/ru$a;)Lcom/google/android/gms/internal/adf;

    move-result-object v0

    return-object v0
.end method

.method protected a(Ljava/io/InputStream;)V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/acc$b;->b:Lcom/google/android/gms/internal/adf$b;

    iget-object v1, p0, Lcom/google/android/gms/internal/acc$b;->a:Lcom/google/android/gms/internal/acc$a;

    invoke-interface {v1, p1}, Lcom/google/android/gms/internal/acc$a;->b(Ljava/io/InputStream;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/adf$b;->a(Ljava/lang/Object;)V

    return-void
.end method

.method protected synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/io/InputStream;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/acc$b;->a(Ljava/io/InputStream;)V

    return-void
.end method
