.class Lcom/google/android/gms/internal/gx$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ju$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/gx;->a(Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ij;Lcom/google/android/gms/internal/ju;Lcom/google/android/gms/internal/ju;Lcom/google/android/gms/internal/jr;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/ju$a",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ju;

.field final synthetic b:Lcom/google/android/gms/internal/gx;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/gx;Lcom/google/android/gms/internal/ju;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/gx$1;->b:Lcom/google/android/gms/internal/gx;

    iput-object p2, p0, Lcom/google/android/gms/internal/gx$1;->a:Lcom/google/android/gms/internal/ju;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/ij;Ljava/lang/Void;Ljava/lang/Integer;)Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/gx$1;->a:Lcom/google/android/gms/internal/ju;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/ju;->e(Lcom/google/android/gms/internal/ij;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0
.end method

.method public bridge synthetic a(Lcom/google/android/gms/internal/ij;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p2, Ljava/lang/Void;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/android/gms/internal/gx$1;->a(Lcom/google/android/gms/internal/ij;Ljava/lang/Void;Ljava/lang/Integer;)Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method
