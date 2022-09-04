.class public interface abstract Lcom/google/firebase/appindexing/g$b;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/firebase/appindexing/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/appindexing/g$b$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/google/firebase/appindexing/internal/Thing$Metadata;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/firebase/appindexing/g$b$a;

    invoke-direct {v0}, Lcom/google/firebase/appindexing/g$b$a;-><init>()V

    invoke-virtual {v0}, Lcom/google/firebase/appindexing/g$b$a;->a()Lcom/google/firebase/appindexing/internal/Thing$Metadata;

    move-result-object v0

    sput-object v0, Lcom/google/firebase/appindexing/g$b;->a:Lcom/google/firebase/appindexing/internal/Thing$Metadata;

    return-void
.end method
