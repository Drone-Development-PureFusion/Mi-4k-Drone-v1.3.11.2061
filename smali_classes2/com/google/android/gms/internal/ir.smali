.class public Lcom/google/android/gms/internal/ir;
.super Ljava/lang/Object;


# instance fields
.field private a:Lcom/google/android/gms/internal/lh;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/la;->j()Lcom/google/android/gms/internal/la;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ir;->a:Lcom/google/android/gms/internal/lh;

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/internal/lh;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/ir;->a:Lcom/google/android/gms/internal/lh;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/android/gms/internal/lh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ir;->a:Lcom/google/android/gms/internal/lh;

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ir;->a:Lcom/google/android/gms/internal/lh;

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/ij;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/ir;->a:Lcom/google/android/gms/internal/lh;

    invoke-interface {v0, p1, p2}, Lcom/google/android/gms/internal/lh;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/lh;)Lcom/google/android/gms/internal/lh;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/ir;->a:Lcom/google/android/gms/internal/lh;

    return-void
.end method
