.class public abstract Lcom/google/android/gms/internal/amf;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/internal/amf$d;,
        Lcom/google/android/gms/internal/amf$c;,
        Lcom/google/android/gms/internal/amf$b;,
        Lcom/google/android/gms/internal/amf$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(ILjava/lang/String;Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "TT;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/google/android/gms/internal/amf;->a:I

    iput-object p2, p0, Lcom/google/android/gms/internal/amf;->b:Ljava/lang/String;

    iput-object p3, p0, Lcom/google/android/gms/internal/amf;->c:Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/amk;->a()Lcom/google/android/gms/internal/amg;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/amg;->a(Lcom/google/android/gms/internal/amf;)V

    return-void
.end method

.method synthetic constructor <init>(ILjava/lang/String;Ljava/lang/Object;Lcom/google/android/gms/internal/amf$1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/google/android/gms/internal/amf;-><init>(ILjava/lang/String;Ljava/lang/Object;)V

    return-void
.end method

.method public static a(ILjava/lang/String;Ljava/lang/Boolean;)Lcom/google/android/gms/internal/amf$a;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/amf$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/amf$a;-><init>(ILjava/lang/String;Ljava/lang/Boolean;)V

    return-object v0
.end method

.method public static a(ILjava/lang/String;I)Lcom/google/android/gms/internal/amf$b;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/amf$b;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/internal/amf$b;-><init>(ILjava/lang/String;Ljava/lang/Integer;)V

    return-object v0
.end method

.method public static a(ILjava/lang/String;J)Lcom/google/android/gms/internal/amf$c;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/amf$c;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Lcom/google/android/gms/internal/amf$c;-><init>(ILjava/lang/String;Ljava/lang/Long;)V

    return-object v0
.end method

.method public static a(ILjava/lang/String;Ljava/lang/String;)Lcom/google/android/gms/internal/amf$d;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/amf$d;

    invoke-direct {v0, p0, p1, p2}, Lcom/google/android/gms/internal/amf$d;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method protected abstract a(Lcom/google/android/gms/internal/ami;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/internal/ami;",
            ")TT;"
        }
    .end annotation
.end method

.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/amf;->b:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/amf;->c:Ljava/lang/Object;

    return-object v0
.end method

.method public c()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-static {}, Lcom/google/android/gms/internal/amk;->b()Lcom/google/android/gms/internal/amh;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/amh;->a(Lcom/google/android/gms/internal/amf;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/amf;->a:I

    return v0
.end method
