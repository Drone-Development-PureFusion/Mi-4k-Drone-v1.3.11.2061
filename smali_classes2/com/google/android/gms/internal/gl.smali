.class public Lcom/google/android/gms/internal/gl;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/firebase/auth/b;


# instance fields
.field private a:Lcom/google/android/gms/internal/go;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/go;)V
    .locals 1
    .param p1    # Lcom/google/android/gms/internal/go;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/common/internal/d;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/go;

    iput-object v0, p0, Lcom/google/android/gms/internal/gl;->a:Lcom/google/android/gms/internal/go;

    return-void
.end method


# virtual methods
.method public a()Lcom/google/firebase/auth/n;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/gl;->a:Lcom/google/android/gms/internal/go;

    return-object v0
.end method
