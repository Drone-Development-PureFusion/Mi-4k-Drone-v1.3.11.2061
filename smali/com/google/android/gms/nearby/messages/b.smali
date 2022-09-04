.class public interface abstract Lcom/google/android/gms/nearby/messages/b;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/android/gms/nearby/messages/b$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable",
        "<",
        "Lcom/google/android/gms/nearby/messages/b;",
        ">;"
    }
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/nearby/messages/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;

    const/4 v1, 0x1

    const-wide/high16 v2, 0x7ff8000000000000L    # Double.NaN

    invoke-direct {v0, v1, v2, v3}, Lcom/google/android/gms/nearby/messages/internal/DistanceImpl;-><init>(ID)V

    sput-object v0, Lcom/google/android/gms/nearby/messages/b;->a:Lcom/google/android/gms/nearby/messages/b;

    return-void
.end method


# virtual methods
.method public abstract a()I
.end method

.method public abstract a(Lcom/google/android/gms/nearby/messages/b;)I
    .param p1    # Lcom/google/android/gms/nearby/messages/b;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param
.end method

.method public abstract b()D
.end method
